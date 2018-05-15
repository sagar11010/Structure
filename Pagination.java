package com.app.garvigurjari.details.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.garvigurjari.R;
import com.app.garvigurjari.api.APIRequest;
import com.app.garvigurjari.api.ResponseCallback;
import com.app.garvigurjari.api.requestModel.SearchProductRequest;
import com.app.garvigurjari.api.responsemodel.SearchProductResponse;
import com.app.garvigurjari.details.adapter.SearchProductAdapter;
import com.app.garvigurjari.utility.Constant;
import com.app.garvigurjari.utility.FontChangeCrawler;
import com.app.garvigurjari.utility.Helper;
import com.app.garvigurjari.utility.MessageUtils;
import com.app.garvigurjari.utility.SessionManager;

import java.util.ArrayList;
import java.util.List;


public class SearchActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = SearchActivity.class.getSimpleName();
    private ImageView ivBack, ivSearch;
    private TextView tvTitle;
    private RecyclerView productRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private EditText edtSearchText;
    private APIRequest apiRequest;
    private List<SearchProductResponse.Product> searchProductResultList;
    private List<SearchProductResponse.Product> searchProductResultListTemp;
    private SearchProductAdapter searchProductAdapter;
    private SessionManager sessionManager;
    private int currentPage = 1, pageNumber = 1;
    private boolean loading = true, isSecond = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        idMapping();

        FontChangeCrawler fontChanger = new FontChangeCrawler(this, getAssets(), Constant.OpenSansRegular, Constant.OpenSansBold);
        fontChanger.replaceFonts((ViewGroup) this.findViewById(android.R.id.content));
    }

    private void idMapping() {
        sessionManager = new SessionManager(this);
        ivBack = findViewById(R.id.iv_back);
        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText(getString(R.string.str_search));
        ivSearch = findViewById(R.id.ivSearch);
        edtSearchText = findViewById(R.id.edtSearchText);

        productRecyclerView = findViewById(R.id.productRecyclerView);
        gridLayoutManager = new GridLayoutManager(this, 2);
        productRecyclerView.setHasFixedSize(true);
        productRecyclerView.setLayoutManager(gridLayoutManager);

        searchProductResultList = new ArrayList<>();
        searchProductResultListTemp = new ArrayList<>();
        ivBack.setOnClickListener(this);
        ivSearch.setOnClickListener(this);

        listPagination();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;

            case R.id.ivSearch:
                if (Helper.isCheckInternet(this)) {
                    if (edtSearchText.getText().toString().isEmpty()) {
                        MessageUtils.showDialogMessage(this, getString(R.string.str_enter_text));
                    } else {
                        if (edtSearchText.getText().length() >= 3) {
                            callSearchProductAPI();
                        } else {
                            MessageUtils.showDialogMessage(this, getString(R.string.str_enter_min_3_char));
                        }
                    }
                }
                break;
        }
    }

    ResponseCallback responseCallback = new ResponseCallback() {
        @Override
        public void ResponseSuccessCallBack(Object object) {
            Helper.hideDialog();
            if (object != null) {
                SearchProductResponse searchProductResponse = (SearchProductResponse) object;
                currentPage = 1;
                loading = true;
                if (searchProductResponse.getSearchProductResult().getProducts().size() == 0) {
                    loading = false;
                    MessageUtils.showDialogMessage(SearchActivity.this, getString(R.string.str_no_product));
                }
                if (isSecond) {
                    searchProductResultListTemp = searchProductResponse.getSearchProductResult().getProducts();
                    searchProductResultList.addAll(searchProductResultListTemp);
                    searchProductAdapter.notifyDataSetChanged();
                    /*searchProductAdapter = new SearchProductAdapter(SearchActivity.this, searchProductResultList);
                    productRecyclerView.setAdapter(searchProductAdapter);*/
                } else {
                    searchProductResultList = searchProductResponse.getSearchProductResult().getProducts();
                    if (searchProductResultList != null && searchProductResultList.size() != 0) {
                        searchProductAdapter = new SearchProductAdapter(SearchActivity.this, searchProductResultList);
                        productRecyclerView.setAdapter(searchProductAdapter);
                    }
                }
            }
        }

        @Override
        public void ResponseFailCallBack(Object object) {
            Helper.hideDialog();
            if (object != null) {
                MessageUtils.showLog(TAG, object.toString());
            }
        }
    };

    private void callSearchProductAPI() {
        Helper.showProgressDialog(this);
        apiRequest = new APIRequest();
        apiRequest.searchProductAPI(searchProductRequest(), responseCallback);
    }

    private SearchProductRequest searchProductRequest() {
        SearchProductRequest searchProductRequest = new SearchProductRequest();
        searchProductRequest.setApiSecretKey(Constant.APISECRETKEY_VALUE);
        searchProductRequest.setCurrencyId(Constant.CURRENCYID_VALUE);
        searchProductRequest.setStoreId(Constant.STOREID_VALUE);
        searchProductRequest.setLanguageId(Constant.LANGUAGEID_VALUE);
        if (sessionManager.retrieveValuefromStringKey(Constant.SM_CUSTOMER_ID).equalsIgnoreCase("")) {
            searchProductRequest.setCustomerId(Constant.CUSTOMERID_VALUE);
        } else {
            searchProductRequest.setCustomerId(sessionManager.retrieveValuefromStringKey(Constant.SM_CUSTOMER_ID));
        }
        SearchProductRequest.model model = new SearchProductRequest.model();
        model.setQ(edtSearchText.getText().toString());
        SearchProductRequest.command command = new SearchProductRequest.command();
        command.setOrderBy(Constant.ORDER_BY_VALUE);
        command.setPageNumber(String.valueOf(pageNumber));
        command.setPageSize(Constant.PAGE_SIZE_VALUE);
        searchProductRequest.setModel(model);
        searchProductRequest.setCommand(command);
        return searchProductRequest;
    }

    private void listPagination() {
        productRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int visibleItemCount = gridLayoutManager.getChildCount();
                int totalItemCount = gridLayoutManager.getItemCount();
                int firstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                int lastVisibleItem = firstVisibleItemPosition + visibleItemCount;
                if (currentPage == 0) {
                } else {
                    if (lastVisibleItem == totalItemCount && loading) {
                        isSecond = true;
                        pageNumber += 1;
                        currentPage = 0;
                        callSearchProductAPI();
                    }
                }
            }
        });
    }
}

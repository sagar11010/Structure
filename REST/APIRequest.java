package com.app.garvigurjari.api;


import com.app.garvigurjari.BuildConfig;
import com.app.garvigurjari.api.loggingInterceptor.Level;
import com.app.garvigurjari.api.loggingInterceptor.LoggingInterceptor;
import com.app.garvigurjari.api.requestModel.AddAddressRequest;
import com.app.garvigurjari.api.requestModel.AddProductReviewRequest;
import com.app.garvigurjari.api.requestModel.AddProductToCartRequest;
import com.app.garvigurjari.api.requestModel.AddressRequest;
import com.app.garvigurjari.api.requestModel.ApplyCouponCodeRequest;
import com.app.garvigurjari.api.requestModel.ApplyGiftCardRequest;
import com.app.garvigurjari.api.requestModel.CartRequest;
import com.app.garvigurjari.api.requestModel.CategoryMenuRequest;
import com.app.garvigurjari.api.requestModel.ChangePasswordRequest;
import com.app.garvigurjari.api.requestModel.ConfirmOrderRequest;
import com.app.garvigurjari.api.requestModel.CustomerInformationRequest;
import com.app.garvigurjari.api.requestModel.CustomerOrderReturnRequest;
import com.app.garvigurjari.api.requestModel.DeleteAddressRequest;
import com.app.garvigurjari.api.requestModel.EditCustomerInfoRequest;
import com.app.garvigurjari.api.requestModel.FeaturedProductRequest;
import com.app.garvigurjari.api.requestModel.ForgotPasswordRequest;
import com.app.garvigurjari.api.requestModel.GetEstimateShippingRequest;
import com.app.garvigurjari.api.requestModel.HomePageSliderRequest;
import com.app.garvigurjari.api.requestModel.LoginRequest;
import com.app.garvigurjari.api.requestModel.NewProductRequest;
import com.app.garvigurjari.api.requestModel.OrderDetailRequest;
import com.app.garvigurjari.api.requestModel.OrderListRequest;
import com.app.garvigurjari.api.requestModel.OrderTotalRequest;
import com.app.garvigurjari.api.requestModel.PaymentInfoRequest;
import com.app.garvigurjari.api.requestModel.PaymentMethodRequest;
import com.app.garvigurjari.api.requestModel.ProductByCategoryRequest;
import com.app.garvigurjari.api.requestModel.ProductDetailsRequest;
import com.app.garvigurjari.api.requestModel.ReOrderRequest;
import com.app.garvigurjari.api.requestModel.RegistrationDetailRequest;
import com.app.garvigurjari.api.requestModel.RelatedProductRequest;
import com.app.garvigurjari.api.requestModel.RemoveCartRequest;
import com.app.garvigurjari.api.requestModel.RemoveDiscountCouponRequest;
import com.app.garvigurjari.api.requestModel.SearchProductRequest;
import com.app.garvigurjari.api.requestModel.SelectPaymentMethodRequest;
import com.app.garvigurjari.api.requestModel.SelectShippingMethodRequest;
import com.app.garvigurjari.api.requestModel.SetAddressRequest;
import com.app.garvigurjari.api.requestModel.ShippingMethodRequest;
import com.app.garvigurjari.api.requestModel.SubCategoryRequest;
import com.app.garvigurjari.api.requestModel.UpdateAddressRequest;
import com.app.garvigurjari.api.requestModel.UpdateCartRequest;
import com.app.garvigurjari.api.requestModel.WishListRequest;
import com.app.garvigurjari.api.requestModel.WishListRemoveRequest;
import com.app.garvigurjari.api.responsemodel.AddAddressResponse;
import com.app.garvigurjari.api.responsemodel.AddProductReviewResponse;
import com.app.garvigurjari.api.responsemodel.AddProductToCartResponse;
import com.app.garvigurjari.api.responsemodel.AddressResponse;
import com.app.garvigurjari.api.responsemodel.ApplyDiscountCouponResponse;
import com.app.garvigurjari.api.responsemodel.ApplyGiftCardResponse;
import com.app.garvigurjari.api.responsemodel.CartResponse;
import com.app.garvigurjari.api.responsemodel.CategoryMenu;
import com.app.garvigurjari.api.responsemodel.ChangePasswordResponse;
import com.app.garvigurjari.api.responsemodel.ConfirmOrderResponse;
import com.app.garvigurjari.api.responsemodel.CustomerInformationResponse;
import com.app.garvigurjari.api.responsemodel.CustomerOrderReturnResponse;
import com.app.garvigurjari.api.responsemodel.DeleteAddressResponse;
import com.app.garvigurjari.api.responsemodel.EditCustomerInfoResponse;
import com.app.garvigurjari.api.responsemodel.FeaturedItemsResponse;
import com.app.garvigurjari.api.responsemodel.ForgotPasswordResponse;
import com.app.garvigurjari.api.responsemodel.GetEstimateShippingResponse;
import com.app.garvigurjari.api.responsemodel.LoginResponse;
import com.app.garvigurjari.api.responsemodel.NewProductsResponse;
import com.app.garvigurjari.api.responsemodel.OrderDetailResponse;
import com.app.garvigurjari.api.responsemodel.OrderListResponse;
import com.app.garvigurjari.api.responsemodel.OrderTotalResponse;
import com.app.garvigurjari.api.responsemodel.PaymentInfoResponse;
import com.app.garvigurjari.api.responsemodel.PaymentMethodResponse;
import com.app.garvigurjari.api.responsemodel.ProductDetailsResponse;
import com.app.garvigurjari.api.responsemodel.ProductsByCategoryResponse;
import com.app.garvigurjari.api.responsemodel.ReOrderResponse;
import com.app.garvigurjari.api.responsemodel.RegistrationDetailResponse;
import com.app.garvigurjari.api.responsemodel.RelatedProductResponse;
import com.app.garvigurjari.api.responsemodel.RemoveCartResponse;
import com.app.garvigurjari.api.responsemodel.RemoveDiscountCouponResponse;
import com.app.garvigurjari.api.responsemodel.RemoveWishListResponse;
import com.app.garvigurjari.api.responsemodel.SearchProductResponse;
import com.app.garvigurjari.api.responsemodel.SelectPaymentMethodResponse;
import com.app.garvigurjari.api.responsemodel.SelectShippingMethodResponse;
import com.app.garvigurjari.api.responsemodel.SetAddressResponse;
import com.app.garvigurjari.api.responsemodel.ShippingMethodResponse;
import com.app.garvigurjari.api.responsemodel.SliderResponse;
import com.app.garvigurjari.api.responsemodel.SubCategoryResponse;
import com.app.garvigurjari.api.responsemodel.UpdateAddressResponse;
import com.app.garvigurjari.api.responsemodel.UpdateCartResponse;
import com.app.garvigurjari.api.responsemodel.WishListResponse;
import com.app.garvigurjari.utility.Constant;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jatin Patel on 11/12/17.
 */

public class APIRequest {
    private String baseURL = Constant.BASE_URL;
    private Retrofit retrofit;
    private APIInterface apiInterface;
    private static final long HTTP_TIMEOUT = TimeUnit.SECONDS.toMillis(60);

    public APIRequest() {

        OkHttpClient.Builder client = new OkHttpClient.Builder();

        client.connectTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
        client.writeTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
        client.readTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);

        client.addInterceptor(new LoggingInterceptor.Builder()
                .loggable(BuildConfig.DEBUG)
                .setLevel(Level.BASIC)
                .log(Platform.INFO)
                .request("Request")
                .response("Response")
                .addHeader("version", BuildConfig.VERSION_NAME)
                .build());
        OkHttpClient okHttpClient = client.build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().disableHtmlEscaping().create()))
                .client(okHttpClient)
                .build();

        apiInterface = retrofit.create(APIInterface.class);
    }

    /**
     * Get Registration  API Request
     *
     * @param param
     * @param callback
     */
    public void getRegistrationDetail(RegistrationDetailRequest param, final ResponseCallback callback) {

        try {
            Call<RegistrationDetailResponse> requestCall = apiInterface.getRegistrationDetail(param);
            requestCall.enqueue(new Callback<RegistrationDetailResponse>() {

                @Override
                public void onResponse(Call<RegistrationDetailResponse> call, Response<RegistrationDetailResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<RegistrationDetailResponse> call, Throwable t) {
                    callback.ResponseSuccessCallBack(t.getMessage());
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get Login  API Request
     *
     * @param param
     * @param callback
     */

    public void getLoginData(LoginRequest param, final ResponseCallback callback) {
        try {
            Call<LoginResponse> loginRequestCall = apiInterface.getLoginData(param);
            loginRequestCall.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    callback.ResponseSuccessCallBack(t.getMessage());
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Forgot password Api Request
     */
    public void forgotPassword(ForgotPasswordRequest param, final ResponseCallback callback) {
        Call<ForgotPasswordResponse> call = apiInterface.apiForgotPassword(param);
        call.enqueue(new Callback<ForgotPasswordResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordResponse> call, Response<ForgotPasswordResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ForgotPasswordResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Change Password Api Request
     *
     * @param param
     * @param callback
     */
    public void changePassword(ChangePasswordRequest param, final ResponseCallback callback) {
        Call<ChangePasswordResponse> requestCall = apiInterface.apiChangePassword(param);
        requestCall.enqueue(new Callback<ChangePasswordResponse>() {
            @Override
            public void onResponse(Call<ChangePasswordResponse> call, Response<ChangePasswordResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ChangePasswordResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Get CustomerInformation Api Request
     *
     * @param param
     * @param callback
     */
    public void getCustomerInformation(CustomerInformationRequest param, final ResponseCallback callback) {
        Call<CustomerInformationResponse> requestCall = apiInterface.getCustomerInformation(param);
        requestCall.enqueue(new Callback<CustomerInformationResponse>() {
            @Override
            public void onResponse(Call<CustomerInformationResponse> call, Response<CustomerInformationResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<CustomerInformationResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Edit CustomerInformation Api Request
     *
     * @param param
     * @param callback
     */
    public void editCustomerInformation(EditCustomerInfoRequest param, final ResponseCallback callback) {
        Call<EditCustomerInfoResponse> requestCall = apiInterface.editCustomerInformation(param);
        requestCall.enqueue(new Callback<EditCustomerInfoResponse>() {
            @Override
            public void onResponse(Call<EditCustomerInfoResponse> call, Response<EditCustomerInfoResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<EditCustomerInfoResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Get Customer Address Api Request
     *
     * @param param
     * @param callback
     */
    public void getCustomerAddress(AddressRequest param, final ResponseCallback callback) {
        Call<AddressResponse> requestCall = apiInterface.getCustomerAddress(param);
        requestCall.enqueue(new Callback<AddressResponse>() {
            @Override
            public void onResponse(Call<AddressResponse> call, Response<AddressResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<AddressResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Add New Address Api Request
     *
     * @param param
     * @param callback
     */
    public void addAddress(AddAddressRequest param, final ResponseCallback callback) {
        Call<AddAddressResponse> requestCall = apiInterface.addAddressAPI(param);
        requestCall.enqueue(new Callback<AddAddressResponse>() {
            @Override
            public void onResponse(Call<AddAddressResponse> call, Response<AddAddressResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<AddAddressResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Update Address Api Request
     *
     * @param param
     * @param callback
     */
    public void updateAddressAPI(UpdateAddressRequest param, final ResponseCallback callback) {
        Call<UpdateAddressResponse> requestCall = apiInterface.updateAddressAPI(param);
        requestCall.enqueue(new Callback<UpdateAddressResponse>() {
            @Override
            public void onResponse(Call<UpdateAddressResponse> call, Response<UpdateAddressResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<UpdateAddressResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Delete Address Api Request
     *
     * @param param
     * @param callback
     */
    public void deleteAddressAPI(DeleteAddressRequest param, final ResponseCallback callback) {
        Call<DeleteAddressResponse> requestCall = apiInterface.deleteAddressAPI(param);
        requestCall.enqueue(new Callback<DeleteAddressResponse>() {
            @Override
            public void onResponse(Call<DeleteAddressResponse> call, Response<DeleteAddressResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<DeleteAddressResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Menu Drawer Category and subcategory Data API Request
     *
     * @param categoryMenuRequest
     * @param callback
     */
    public void getCategoryMenu(CategoryMenuRequest categoryMenuRequest, final ResponseCallback callback) {
        try {
            Call<CategoryMenu> requestCall = apiInterface.getCategoryMenu(categoryMenuRequest);
            requestCall.enqueue(new Callback<CategoryMenu>() {
                @Override
                public void onResponse(Call<CategoryMenu> call, Response<CategoryMenu> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<CategoryMenu> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Home Page View Pager Data API Request
     *
     * @param homePageSliderRequest
     * @param callback
     */
    public void getSliderData(HomePageSliderRequest homePageSliderRequest, final ResponseCallback callback) {
        try {
            Call<SliderResponse> requestCall = apiInterface.getSliderData(homePageSliderRequest);
            requestCall.enqueue(new Callback<SliderResponse>() {
                @Override
                public void onResponse(Call<SliderResponse> call, Response<SliderResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<SliderResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * New Products Data API request
     *
     * @param param
     * @param callback
     */
    public void getNewProductsData(NewProductRequest param, final ResponseCallback callback) {
        try {
            Call<NewProductsResponse> requestCall = apiInterface.getNewProductsData(param);
            requestCall.enqueue(new Callback<NewProductsResponse>() {
                @Override
                public void onResponse(Call<NewProductsResponse> call, Response<NewProductsResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<NewProductsResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Featured Product Data API Request
     *
     * @param param
     * @param callback
     */
    public void getFeaturedProductData(FeaturedProductRequest param, final ResponseCallback callback) {
        try {
            Call<FeaturedItemsResponse> requestCall = apiInterface.getFeaturedProductData(param);
            requestCall.enqueue(new Callback<FeaturedItemsResponse>() {
                @Override
                public void onResponse(Call<FeaturedItemsResponse> call, Response<FeaturedItemsResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<FeaturedItemsResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Product Details API Request
     *
     * @param param
     * @param callback
     */
    public void getProductDetailsData(ProductDetailsRequest param, final ResponseCallback callback) {
        try {
            Call<ProductDetailsResponse> requestCall = apiInterface.getProductDetailsData(param);
            requestCall.enqueue(new Callback<ProductDetailsResponse>() {
                @Override
                public void onResponse(Call<ProductDetailsResponse> call, Response<ProductDetailsResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<ProductDetailsResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Related Products API Request
     *
     * @param param
     * @param callback
     */
    public void getRelatedProductData(RelatedProductRequest param, final ResponseCallback callback) {
        try {
            Call<RelatedProductResponse> requestCall = apiInterface.getRelatedProductData(param);
            requestCall.enqueue(new Callback<RelatedProductResponse>() {
                @Override
                public void onResponse(Call<RelatedProductResponse> call, Response<RelatedProductResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<RelatedProductResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get Product by Category API Request
     *
     * @param param
     * @param callback
     */
    public void getProductByCategoryData(ProductByCategoryRequest param, final ResponseCallback callback) {
        try {
            Call<ProductsByCategoryResponse> requestCall = apiInterface.getProductsByCategoryData(param);
            requestCall.enqueue(new Callback<ProductsByCategoryResponse>() {
                @Override
                public void onResponse(Call<ProductsByCategoryResponse> call, Response<ProductsByCategoryResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<ProductsByCategoryResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Search product Api Request
     *
     * @param param
     * @param callback
     */
    public void searchProductAPI(SearchProductRequest param, final ResponseCallback callback) {
        Call<SearchProductResponse> requestCall = apiInterface.searchProductAPI(param);
        requestCall.enqueue(new Callback<SearchProductResponse>() {
            @Override
            public void onResponse(Call<SearchProductResponse> call, Response<SearchProductResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<SearchProductResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * Get Get Shopping Cart Request
     *
     * @param param
     * @param callback
     */
    public void getCartData(CartRequest param, final ResponseCallback callback) {
        try {

            Call<CartResponse> cartResponseCall = apiInterface.getCartData(param);
            cartResponseCall.enqueue(new Callback<CartResponse>() {
                @Override
                public void onResponse(Call<CartResponse> call, Response<CartResponse> response) {
                    callback.ResponseSuccessCallBack(response.body());
                }

                @Override
                public void onFailure(Call<CartResponse> call, Throwable t) {
                    callback.ResponseFailCallBack(t.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * AddToProductCart Api Request
     *
     * @param param
     * @param callback
     */
    public void addToProductCart(AddProductToCartRequest param, final ResponseCallback callback) {
        Call<AddProductToCartResponse> addProductToCartResponseCall = apiInterface.getAddToCartData(param);
        addProductToCartResponseCall.enqueue(new Callback<AddProductToCartResponse>() {
            @Override
            public void onResponse(Call<AddProductToCartResponse> call, Response<AddProductToCartResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<AddProductToCartResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * RemoveProductCart Api Request
     *
     * @param param
     * @param callback
     */
    public void removeProductCart(RemoveCartRequest param, final ResponseCallback callback) {
        Call<RemoveCartResponse> call = apiInterface.removeProductCart(param);
        call.enqueue(new Callback<RemoveCartResponse>() {
            @Override
            public void onResponse(Call<RemoveCartResponse> call, Response<RemoveCartResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<RemoveCartResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Update ProductCart Api Request
     *
     * @param param
     * @param callback
     */
    public void updateProductCart(UpdateCartRequest param, final ResponseCallback callback) {
        Call<UpdateCartResponse> call = apiInterface.updateProductCart(param);
        call.enqueue(new Callback<UpdateCartResponse>() {
            @Override
            public void onResponse(Call<UpdateCartResponse> call, Response<UpdateCartResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<UpdateCartResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Get Order List Data Api Request
     */
    public void getOrderList(OrderListRequest param, final ResponseCallback callback) {
        Call<OrderListResponse> call = apiInterface.getOrderListData(param);
        call.enqueue(new Callback<OrderListResponse>() {
            @Override
            public void onResponse(Call<OrderListResponse> call, Response<OrderListResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<OrderListResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Get OrderTotals Api Request
     */

    public void getOrderTotal(OrderTotalRequest param, final ResponseCallback callback) {
        Call<OrderTotalResponse> call = apiInterface.getOrderTotalData(param);
        call.enqueue(new Callback<OrderTotalResponse>() {
            @Override
            public void onResponse(Call<OrderTotalResponse> call, Response<OrderTotalResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<OrderTotalResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * getOrderDetails API Request
     */
    public void getOrderDetails(OrderDetailRequest param, final ResponseCallback callback) {
        Call<OrderDetailResponse> call = apiInterface.getOrderDetails(param);
        call.enqueue(new Callback<OrderDetailResponse>() {
            @Override
            public void onResponse(Call<OrderDetailResponse> call, Response<OrderDetailResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<OrderDetailResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * ReOrders
     */
    public void reOrders(ReOrderRequest param, final ResponseCallback callback) {
        Call<ReOrderResponse> call = apiInterface.reOrders(param);
        call.enqueue(new Callback<ReOrderResponse>() {
            @Override
            public void onResponse(Call<ReOrderResponse> call, Response<ReOrderResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ReOrderResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * ApplyDiscountCoupon
     */

    public void applyDiscountCoupon(ApplyCouponCodeRequest param, final ResponseCallback callback) {
        Call<ApplyDiscountCouponResponse> call = apiInterface.applyDiscountCoupon(param);
        call.enqueue(new Callback<ApplyDiscountCouponResponse>() {
            @Override
            public void onResponse(Call<ApplyDiscountCouponResponse> call, Response<ApplyDiscountCouponResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ApplyDiscountCouponResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * RemoveDiscountCoupon
     */

    public void removeDiscountCoupon(RemoveDiscountCouponRequest param, final ResponseCallback callback) {
        Call<RemoveDiscountCouponResponse> call = apiInterface.removeDiscountCoupon(param);
        call.enqueue(new Callback<RemoveDiscountCouponResponse>() {
            @Override
            public void onResponse(Call<RemoveDiscountCouponResponse> call, Response<RemoveDiscountCouponResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<RemoveDiscountCouponResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Add Gift Card
     *
     * @param param
     * @param callback
     */
    public void addGiftCard(ApplyGiftCardRequest param, final ResponseCallback callback) {
        Call<ApplyGiftCardResponse> call = apiInterface.applyGiftCard(param);
        call.enqueue(new Callback<ApplyGiftCardResponse>() {
            @Override
            public void onResponse(Call<ApplyGiftCardResponse> call, Response<ApplyGiftCardResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ApplyGiftCardResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Set Check Out Address
     *
     * @param param
     * @param callback
     */
    public void setAddress(SetAddressRequest param, final ResponseCallback callback) {
        Call<SetAddressResponse> call = apiInterface.setAddress(param);
        call.enqueue(new Callback<SetAddressResponse>() {
            @Override
            public void onResponse(Call<SetAddressResponse> call, Response<SetAddressResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<SetAddressResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * get Subcategory
     *
     * @param param
     * @param callback
     */
    public void getSubCategory(SubCategoryRequest param, final ResponseCallback callback) {
        Call<SubCategoryResponse> call = apiInterface.getSubCategory(param);
        call.enqueue(new Callback<SubCategoryResponse>() {
            @Override
            public void onResponse(Call<SubCategoryResponse> call, Response<SubCategoryResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<SubCategoryResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * get wish List API Request
     *
     * @param param
     * @param callback
     */

    public void getWishList(WishListRequest param, final ResponseCallback callback) {
        Call<WishListResponse> call = apiInterface.getWishListData(param);
        call.enqueue(new Callback<WishListResponse>() {
            @Override
            public void onResponse(Call<WishListResponse> call, Response<WishListResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<WishListResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * removeWishlist Api Request
     *
     * @param param
     * @param callback
     */
    public void removeWishlist(WishListRemoveRequest param, final ResponseCallback callback) {
        Call<RemoveWishListResponse> call = apiInterface.removeWishListData(param);
        call.enqueue(new Callback<RemoveWishListResponse>() {
            @Override
            public void onResponse(Call<RemoveWishListResponse> call, Response<RemoveWishListResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<RemoveWishListResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Get Estimate Shipping
     *
     * @param param
     * @param callback
     */
    public void getEstimateShipping(GetEstimateShippingRequest param, final ResponseCallback callback) {
        Call<GetEstimateShippingResponse> call = apiInterface.getEstimateShipping(param);
        call.enqueue(new Callback<GetEstimateShippingResponse>() {
            @Override
            public void onResponse(Call<GetEstimateShippingResponse> call, Response<GetEstimateShippingResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<GetEstimateShippingResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Select Payment Method
     *
     * @param param
     * @param callback
     */
    public void selectPaymentMethod(SelectPaymentMethodRequest param, final ResponseCallback callback) {
        Call<SelectPaymentMethodResponse> call = apiInterface.selectPaymentMethod(param);
        call.enqueue(new Callback<SelectPaymentMethodResponse>() {
            @Override
            public void onResponse(Call<SelectPaymentMethodResponse> call, Response<SelectPaymentMethodResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<SelectPaymentMethodResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Select Shipping Method
     *
     * @param param
     * @param callback
     */
    public void selectShippingMethod(SelectShippingMethodRequest param, final ResponseCallback callback) {
        Call<SelectShippingMethodResponse> call = apiInterface.selectShippingMethod(param);
        call.enqueue(new Callback<SelectShippingMethodResponse>() {
            @Override
            public void onResponse(Call<SelectShippingMethodResponse> call, Response<SelectShippingMethodResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<SelectShippingMethodResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }


    /**
     * get Return Order Request List
     *
     * @param param
     * @param callback
     */
    public void getReturnRequestOrder(CustomerOrderReturnRequest param, final ResponseCallback callback) {
        Call<CustomerOrderReturnResponse> call = apiInterface.getReturnOrderRequest(param);
        call.enqueue(new Callback<CustomerOrderReturnResponse>() {
            @Override
            public void onResponse(Call<CustomerOrderReturnResponse> call, Response<CustomerOrderReturnResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<CustomerOrderReturnResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * get Set payment information
     *
     * @param param
     * @param callback
     */
    public void setPaymentInfo(PaymentInfoRequest param, final ResponseCallback callback) {
        Call<PaymentInfoResponse> call = apiInterface.setPaymentInfo(param);
        call.enqueue(new Callback<PaymentInfoResponse>() {
            @Override
            public void onResponse(Call<PaymentInfoResponse> call, Response<PaymentInfoResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<PaymentInfoResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * get Payment Methods
     *
     * @param param
     * @param callback
     */
    public void getPaymentMethod(PaymentMethodRequest param, final ResponseCallback callback) {
        Call<PaymentMethodResponse> call = apiInterface.getPaymentMethod(param);
        call.enqueue(new Callback<PaymentMethodResponse>() {
            @Override
            public void onResponse(Call<PaymentMethodResponse> call, Response<PaymentMethodResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<PaymentMethodResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * get Payment Methods
     *
     * @param param
     * @param callback
     */
    public void getShippingMethod(ShippingMethodRequest param, final ResponseCallback callback) {
        Call<ShippingMethodResponse> call = apiInterface.getShippingMethod(param);
        call.enqueue(new Callback<ShippingMethodResponse>() {
            @Override
            public void onResponse(Call<ShippingMethodResponse> call, Response<ShippingMethodResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ShippingMethodResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * add Product Review
     *
     * @param param
     * @param callback
     */
    public void addProductReview(AddProductReviewRequest param, final ResponseCallback callback) {
        Call<AddProductReviewResponse> call = apiInterface.addProductReview(param);
        call.enqueue(new Callback<AddProductReviewResponse>() {
            @Override
            public void onResponse(Call<AddProductReviewResponse> call, Response<AddProductReviewResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<AddProductReviewResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }

    /**
     * Confirm Order
     *
     * @param param
     * @param callback
     */
    public void confirmOrder(ConfirmOrderRequest param, final ResponseCallback callback) {
        Call<ConfirmOrderResponse> call = apiInterface.confirmOrder(param);
        call.enqueue(new Callback<ConfirmOrderResponse>() {
            @Override
            public void onResponse(Call<ConfirmOrderResponse> call, Response<ConfirmOrderResponse> response) {
                callback.ResponseSuccessCallBack(response.body());
            }

            @Override
            public void onFailure(Call<ConfirmOrderResponse> call, Throwable t) {
                callback.ResponseFailCallBack(t.getMessage());
            }
        });
    }
}



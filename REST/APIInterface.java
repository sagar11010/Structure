package com.app.garvigurjari.api;


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

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {

    /**
     * GetRegistrationDetail
     *
     * @param param
     * @return
     */
    @POST("RegisterCustomer")
    Call<RegistrationDetailResponse> getRegistrationDetail(@Body RegistrationDetailRequest param);

    /**
     * GetLoginDetail
     *
     * @param param
     * @return
     */
    @POST("Login")
    Call<LoginResponse> getLoginData(@Body LoginRequest param);


    /**
     * ChangePassword
     *
     * @param param
     * @return
     */
    @POST("ChangePwd")
    Call<ChangePasswordResponse> apiChangePassword(@Body ChangePasswordRequest param);

    /**
     * Forgot Password
     *
     * @param param
     * @return
     */
    @POST("PasswordRecovery")
    Call<ForgotPasswordResponse> apiForgotPassword(@Body ForgotPasswordRequest param);

    /**
     * Retrieve the information of customer.
     *
     * @param param
     * @return
     */
    @POST("Info")
    Call<CustomerInformationResponse> getCustomerInformation(@Body CustomerInformationRequest param);


    /**
     * Personal information will edit by the user.
     *
     * @param param
     * @return
     */
    @POST("InfoEdit")
    Call<EditCustomerInfoResponse> editCustomerInformation(@Body EditCustomerInfoRequest param);


    /**
     * Retrieve the addresses of user.
     *
     * @param param
     * @return
     */
    @POST("GetAddress")
    Call<AddressResponse> getCustomerAddress(@Body AddressRequest param);

    /**
     * Add new Address.
     *
     * @param param
     * @return
     */
    @POST("AddAddress")
    Call<AddAddressResponse> addAddressAPI(@Body AddAddressRequest param);


    /**
     * Customer can update the address.
     *
     * @param param
     * @return
     */
    @POST("UpdateAddress")
    Call<UpdateAddressResponse> updateAddressAPI(@Body UpdateAddressRequest param);


    /**
     * Customer can delete the address.
     *
     * @param param
     * @return
     */
    @POST("DeleteAddress")
    Call<DeleteAddressResponse> deleteAddressAPI(@Body DeleteAddressRequest param);


    /**
     * Menu Drawer
     *
     * @param param
     * @return
     */
    @POST("TopMenu")
    Call<CategoryMenu> getCategoryMenu(@Body CategoryMenuRequest param);

    /**
     * Home Page Banner View Pager
     *
     * @param param
     * @return
     */
    @POST("NivoSlider")
    Call<SliderResponse> getSliderData(@Body HomePageSliderRequest param);

    /**
     * Home Page New Product
     *
     * @param param
     * @return
     */
    @POST("RecentlyAddedProducts")
    Call<NewProductsResponse> getNewProductsData(@Body NewProductRequest param);

    /**
     * Home Page Featured Product
     *
     * @param param
     * @return
     */
    @POST("HomePageProducts")
    Call<FeaturedItemsResponse> getFeaturedProductData(@Body FeaturedProductRequest param);


    /**
     * Product Details
     *
     * @param param
     * @return
     */
    @POST("ProductDetail")
    Call<ProductDetailsResponse> getProductDetailsData(@Body ProductDetailsRequest param);

    /**
     * Related Products
     *
     * @param param
     * @return
     */
    @POST("RelatedProducts")
    Call<RelatedProductResponse> getRelatedProductData(@Body RelatedProductRequest param);

    /**
     * GetProductByCategory
     *
     * @param map
     * @return
     */
    @POST("Category")
    Call<ProductsByCategoryResponse> getProductsByCategoryData(@Body ProductByCategoryRequest map);


    /**
     * Retrieve the list of search product..
     *
     * @param param
     * @return
     */
    @POST("SearchProduct")
    Call<SearchProductResponse> searchProductAPI(@Body SearchProductRequest param);


    /**
     * GetCartProduct
     *
     * @param param
     * @return
     */
    @POST("Cart")
    Call<CartResponse> getCartData(@Body CartRequest param);


    /**
     * AddProductToCart
     *
     * @param param
     * @return
     */
    @POST("AddProductToCart")
    Call<AddProductToCartResponse> getAddToCartData(@Body AddProductToCartRequest param);


    /**
     * Remove Product Cart
     *
     * @param param
     * @return
     */
    @POST("RemoveFromCart")
    Call<RemoveCartResponse> removeProductCart(@Body RemoveCartRequest param);


    /**
     * Update Product Cart
     *
     * @param param
     * @return
     */
    @POST("UpdateCart")
    Call<UpdateCartResponse> updateProductCart(@Body UpdateCartRequest param);

    /**
     * get order list data
     *
     * @param param
     * @return
     */
    @POST("GetOrder")
    Call<OrderListResponse> getOrderListData(@Body OrderListRequest param);

    /**
     * get OrderTotals data
     *
     * @param param
     * @return
     */
    @POST("OrderTotals")
    Call<OrderTotalResponse> getOrderTotalData(@Body OrderTotalRequest param);


    /**
     * get GetOrderDetail
     *
     * @param param
     * @return
     */
    @POST("GetOrderDetail")
    Call<OrderDetailResponse> getOrderDetails(@Body OrderDetailRequest param);

    /**
     * get ReOrder
     *
     * @param param
     * @return
     */
    @POST("ReOrder")
    Call<ReOrderResponse> reOrders(@Body ReOrderRequest param);

    /**
     * ApplyDiscountCouponResult
     *
     * @param param
     * @return
     */
    @POST("ApplyDiscountCoupon")
    Call<ApplyDiscountCouponResponse> applyDiscountCoupon(@Body ApplyCouponCodeRequest param);

    /**
     * RemoveDiscountCouponResult
     *
     * @param param
     * @return
     */
    @POST("RemoveDiscountCoupon")
    Call<RemoveDiscountCouponResponse> removeDiscountCoupon(@Body RemoveDiscountCouponRequest param);

    /**
     * Apply Gift Card
     *
     * @param param
     * @return
     */
    @POST("ApplyGiftCard")
    Call<ApplyGiftCardResponse> applyGiftCard(@Body ApplyGiftCardRequest param);

    /**
     * Set Address
     *
     * @param param
     * @return
     */
    @POST("SetAddress")
    Call<SetAddressResponse> setAddress(@Body SetAddressRequest param);


    /**
     * Get Sub category list
     *
     * @param param
     * @return
     */
    @POST("Category")
    Call<SubCategoryResponse> getSubCategory(@Body SubCategoryRequest param);

    /**
     * get wish list data
     *
     * @param param
     * @return
     */
    @POST("wishlist")
    Call<WishListResponse> getWishListData(@Body WishListRequest param);

    /**
     * RemoveFromWishlist
     *
     * @param param
     * @return
     */
    @POST("RemoveFromWishlist")
    Call<RemoveWishListResponse> removeWishListData(@Body WishListRemoveRequest param);

    /**
     * Get Estimate shipping
     *
     * @param param
     * @return
     */
    @POST("GetEstimateShipping")
    Call<GetEstimateShippingResponse> getEstimateShipping(@Body GetEstimateShippingRequest param);

    /**
     * Select Payment Method
     *
     * @param param
     * @return
     */
    @POST("SelectPaymentMethod")
    Call<SelectPaymentMethodResponse> selectPaymentMethod(@Body SelectPaymentMethodRequest param);

    /**
     * Select Shipping Method
     *
     * @param param
     * @return
     */
    @POST("ShippingMethod")
    Call<SelectShippingMethodResponse> selectShippingMethod(@Body SelectShippingMethodRequest param);

    /**
     * Return Order Request Order List
     *
     * @param param
     * @return
     */
    @POST("CustomerReturnRequests")
    Call<CustomerOrderReturnResponse> getReturnOrderRequest(@Body CustomerOrderReturnRequest param);

    /**
     * Enter Credit card information
     *
     * @param param
     * @return
     */
    @POST("EnterPaymentInfo")
    Call<PaymentInfoResponse> setPaymentInfo(@Body PaymentInfoRequest param);

    /**
     * Get Payment Method
     *
     * @param param
     * @return
     */
    @POST("PaymentMethod")
    Call<PaymentMethodResponse> getPaymentMethod(@Body PaymentMethodRequest param);

    /**
     * Get Shipping Method
     *
     * @param param
     * @return
     */
    @POST("ShippingMethod")
    Call<ShippingMethodResponse> getShippingMethod(@Body ShippingMethodRequest param);

    /**
     * Add Product Review
     *
     * @param param
     * @return
     */
    @POST("ProductReviewsAdd")
    Call<AddProductReviewResponse> addProductReview(@Body AddProductReviewRequest param);

    /**
     * Confirm Order
     *
     * @param param
     * @return
     */
    @POST("ConfirmOrder")
    Call<ConfirmOrderResponse> confirmOrder(@Body ConfirmOrderRequest param);

}

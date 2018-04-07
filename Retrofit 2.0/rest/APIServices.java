package com.app.nrisamajuser.rest;

import com.app.nrisamajuser.home_module.categoryList.Model.CategoryModel;
import com.app.nrisamajuser.home_module.categoryList.CategoryOffersList.Model.CategoryOffersModel;
import com.app.nrisamajuser.home_module.categoryList.Model.CouponBannerModel;
import com.app.nrisamajuser.model.CommonModel;
import com.app.nrisamajuser.user_module.Login.model.LoginModel;
import com.app.nrisamajuser.model.LogoutModel;
import com.app.nrisamajuser.user_module.Registration.model.RegistrationModel;

import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by shivlab-android on 31/7/17.
 */

public interface APIServices {

    @FormUrlEncoded
    @POST("getCouponCategory")
    Call<CategoryModel> getCategory(@FieldMap Map<String, String> param);

    @FormUrlEncoded
    @POST("getCategoryOffers")
    Call<CategoryOffersModel> getCategoryOffers(@FieldMap Map<String, String> param);

   /* @Multipart
    @POST("user_registration")
    Call<RegistrationModel> api_getRegistration(@PartMap Map<String, RequestBody> params);*/

    @POST("user_registration")
    Call<RegistrationModel> api_getRegistration(@Body MultipartBody multipartTypedOutput);


    @FormUrlEncoded
    @POST("check_member_login")
    Call<LoginModel> api_check_member_login(@FieldMap Map<String, String> param);

    @FormUrlEncoded
    @POST("user_logout")
    Call<LogoutModel> api_user_logout(@FieldMap Map<String, String> param);


    @FormUrlEncoded
    @POST("forgot_password")
    Call<CommonModel> api_forgot_password(@FieldMap Map<String, String> param);

    @FormUrlEncoded
    @POST("change_password")
    Call<CommonModel> api_change_password(@FieldMap Map<String, String> param);


    /*@Multipart
    @POST("user_edit_profile")
    Call<RegistrationModel> api_user_edit_profile(@PartMap Map<String, RequestBody> params);*/


    @POST("user_edit_profile")
    Call<RegistrationModel> api_user_edit_profile(@Body MultipartBody multipartTypedOutput);


    @FormUrlEncoded
    @POST("getCouponBanner")
    Call<CouponBannerModel> api_get_coupon_banner(@FieldMap Map<String, String> param);
}

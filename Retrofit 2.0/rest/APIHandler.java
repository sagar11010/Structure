package com.app.nrisamajuser.rest;

import com.app.nrisamajuser.BuildConfig;
import com.app.nrisamajuser.rest.loggingInterceptor.Level;
import com.app.nrisamajuser.rest.loggingInterceptor.LoggingInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by shivlab-android on 31/7/17.
 */

public class APIHandler {
    private static final long HTTP_TIMEOUT = TimeUnit.SECONDS.toMillis(60);
    //public static String BASE_URL = "http://dev.shivlab.com/nrisamaj/api/api.php";
    //public static String BASE_URL = "http://dev.shivlab.com/nrisamaj/api/";
    public static String BASE_URL = "http://dev.shivlab.com/nrisamaj/api/";

    private static Retrofit getRetrofitInstance() {
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

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

    }

    public static APIServices getApiServices() {
        return getRetrofitInstance().create(APIServices.class);
    }
}

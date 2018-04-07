package com.worknetwork.rest;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.worknetwork.utils.Constants;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by Shivlabs on 8/12/2016.
 */
public class APIHandler
{
    private static final String BASE_URL = Constants.Base_URL;

    private static final long HTTP_TIMEOUT = TimeUnit.SECONDS.toMillis(120);
    private static WorkNetwork_APIServices apiService;


    /**
     * For Normal Application related API Calling done here
     *
     * @return
     */
    public static WorkNetwork_APIServices getApiService()
    {
        if (apiService == null)
        {
            OkHttpClient okHttpClient = new OkHttpClient();

            okHttpClient.setConnectTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
            okHttpClient.setWriteTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);
            okHttpClient.setReadTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS);


            //For create retrofit instance
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setEndpoint(BASE_URL)
                    .setClient(new OkClient(okHttpClient))
                    .setConverter(new GsonConverter(new Gson()))
                    .build();

            apiService = restAdapter.create(WorkNetwork_APIServices.class);
            return apiService;
        }
        else
        {
            return apiService;
        }

    }
}

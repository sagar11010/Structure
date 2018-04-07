package com.example.shivlab_android.jsondemo.model;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class HttpHandler {

    public HttpHandler() {
    }

    public String makeServicesCall(String requrl) {
        String respomse = null;
        try {
            URL url = new URL(requrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            //Read Response
            InputStream ins = new BufferedInputStream(connection.getInputStream());
            respomse = convertStreamToString(ins);

        } catch (MalformedURLException ex) {
            Log.v("MalformedURLException", ex.toString());
        } catch (IOException ex) {
            Log.v("IOException", ex.toString());
        } catch (Exception ex) {
            Log.v("Exception HttpHandler", ex.toString());
        }
        return respomse;
    }

    public String convertStreamToString(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');

            }
        } catch (IOException ex) {
            Log.v("IOException", ex.toString());
        } finally {
            try {
                in.close();
            } catch (Exception ex) {
                Log.v("Exception ", ex.toString());
            }
        }
        return sb.toString();
    }
}

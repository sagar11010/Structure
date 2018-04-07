package com.app.nrisamajuser.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by dipali-shivlab on 7/4/17.
 */
public class SessionManager {
    public static final String mypreference = "mypref";

    private Context context;
    private SharedPreferences sharedPreferences;
   
    public SessionManager(Context context) {
        sharedPreferences = context.getSharedPreferences(mypreference, Context.MODE_PRIVATE);
    }

    public String saveStringValue(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();
        Log.e("save_value", value);
        return key;
    }


    public String retrieveValuefromStringKey(String key)
    {
        Log.e("retrive_value",key);
        return sharedPreferences.getString(key, "");
    }

    public void saveBooleanValue(String key, boolean value) {  sharedPreferences.edit().putBoolean(key, value).apply();    }

    public boolean retrieveValuefromBooleanKey(String key) {  return sharedPreferences.getBoolean(key, false);    }

}

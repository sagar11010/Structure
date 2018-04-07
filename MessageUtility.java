package com.utilsdemo;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by shivlab-android on 3/7/17.
 */

public class MessageUtility {


    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void showLog(String TAG, String msg) {
        Log.e(TAG, msg);
    }

    public static String[] getSplit(String value, String regex) {
        if (value == null) return null;
        return value.split(regex);
    }

   /* public static void snackBar(View view, String message){
        Snackbar snackbar=Snackbar.make(view,message,Snackbar.LENGTH_SHORT)
                .setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();
    }*/

}

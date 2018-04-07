package com.example.shivlab_android.jsondemo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.ParseException;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.shivlab_android.jsondemo.model.ContactInfo;
import com.example.shivlab_android.jsondemo.model.DB_helper;
import com.example.shivlab_android.jsondemo.model.HttpHandler;
import com.example.shivlab_android.jsondemo.model.MyAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static android.support.v7.app.AlertDialog.*;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ContactInfo> data = new ArrayList<>();
    ArrayList<HashMap<String, String>> contactlist;
    private ListView lv;
    Context context = MainActivity.this;
    private ProgressDialog pDialog;
  
    String c_id, c_name, c_email, c_address, c_gender, c_mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_
        lv = (ListView) findViewById(R.id.list_item);
      
        if (checkInternetConenction() == true) {
            contactlist = new ArrayList<>();
            new GetContacts().execute();
        } else {
            readDataAll();
        }
    }

    


    //Get Inforamation to API Class
    public class GetContacts extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Showing progress dialog
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            HttpHandler handler = new HttpHandler();
            String url = "http://api.androidhive.info/contacts/";
            String jsonStr = handler.makeServicesCall(url);
            Log.v("Response url", jsonStr.toString());

            if (jsonStr != null) {
                try {
                    JSONObject jsonObject = new JSONObject(jsonStr);
                    JSONArray contacts = jsonObject.getJSONArray("contacts");
                    for (int i = 0; i < contacts.length(); i++) {
                        JSONObject c = contacts.getJSONObject(i);
                        String id = c.getString("id");
                        String name = c.getString("name");
                        String email = c.getString("email");
                        String address = c.getString("address");
                        String gender = c.getString("gender");

                        JSONObject phone = c.getJSONObject("phone");
                        String mobile = phone.getString("mobile");
                        String home = phone.getString("home");
                        String office = phone.getString("office");

                        // tmp hash map for single contact
                        HashMap<String, String> contact = new HashMap<>();
                        contact.put("id", id);
                        contact.put("name", name);
                        contact.put("email", email);
                        contact.put("address", address);
                        contact.put("gender", gender);
                        contact.put("mobile", mobile);
                        contact.put("home", home);
                        contact.put("office", office);

                        contactlist.add(contact);
                        //check Data is already store or not in DB
                        String temp = db.getSinlgeEntry(id);
                        if (id.equals(temp)) {
                        } else {
                            //Insert Data in DB
                            c_id = id.toString();
                            c_name = name.toString();
                            c_email = email.toString();
                            c_address = address.toString();
                            c_gender = gender.toString();
                            c_mobile = mobile.toString();
                            ContactInfo mdata = new ContactInfo(c_id, c_name, c_email, c_address, c_gender, c_mobile);
                            db.addContact(mdata);
                        }

                    }

                } catch (final Exception ex) {
                    Log.v("Json Exception", ex.toString());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Json parsing error: " + ex.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            } else {

            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            pDialog.dismiss();
            ListAdapter listAdapter = new SimpleAdapter(MainActivity.this, contactlist, R.layout.list_item_layout, new String[]{"name", "email", "address", "gender", "mobile", "home", "office"}, new int[]{R.id.name, R.id.email, R.id.address, R.id.gender, R.id.mobile, R.id.home, R.id.office});
            lv.setAdapter(listAdapter);
        }
        //Read Data

    }

}

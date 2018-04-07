package com.app.nrisamajuser.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SqlLiteDbHelper extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "CountryCityStateDB.sqlite";
    // Contacts table name
    private static final String DB_PATH_SUFFIX = "/databases/";
    static Context ctx;

    public SqlLiteDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        ctx = context;
    }

    private static String getDatabasePath() {
        return ctx.getApplicationInfo().dataDir + DB_PATH_SUFFIX
                + DATABASE_NAME;
    }

   /* // Getting single contact
    public Contact Get_ContactDetails() {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM Countries", null);
        if (cursor != null && cursor.moveToFirst()) {
            Contact cont = new Contact(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            // return contact
            cursor.close();
            db.close();

            return cont;

        }
        return null;
    }*/

    public List<Countries> getCountries() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Countries", null);
        List countriesList = cursorToListForCountries(cursor);
        return countriesList;
    }

    private List<Countries> cursorToListForCountries(Cursor cursor) {
        List<Countries> autoSevaCountriesList = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                Countries autoSevaDetail = new Countries();
                autoSevaDetail.setId(cursor.getString(cursor.getColumnIndex("ID")));
                autoSevaDetail.setSortname(cursor.getString(cursor.getColumnIndex("SortName")));
                autoSevaDetail.setName(cursor.getString(cursor.getColumnIndex("Name")));
                autoSevaDetail.setPhonecode(cursor.getString(cursor.getColumnIndex("PhoneCode")));
                autoSevaCountriesList.add(autoSevaDetail);
            }
        }
        return autoSevaCountriesList;
    }

    public List<StateModel> getState(String CountryID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM States WHERE CountryID = '" + CountryID + "'", null);
        List stateList = cursorToListForState(cursor);
        return stateList;
    }

    private List<StateModel> cursorToListForState(Cursor cursor) {
        List<StateModel> autoSevaStateList = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                StateModel autoSevaDetail = new StateModel();
                autoSevaDetail.setID(cursor.getString(cursor.getColumnIndex("ID")));
                autoSevaDetail.setName(cursor.getString(cursor.getColumnIndex("Name")));
                autoSevaDetail.setCountryID(cursor.getString(cursor.getColumnIndex("CountryID")));
                autoSevaStateList.add(autoSevaDetail);
            }
        }
        return autoSevaStateList;
    }

    public List<CityModel> getCity(String StateID) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Cities WHERE StateID = '" + StateID + "'", null);
        List cityList = cursorToListForCity(cursor);
        return cityList;
    }

    private List<CityModel> cursorToListForCity(Cursor cursor) {
        List<CityModel> autoSevaCityList = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                CityModel autoSevaDetail = new CityModel();
                autoSevaDetail.setId(cursor.getString(cursor.getColumnIndex("ID")));
                autoSevaDetail.setName(cursor.getString(cursor.getColumnIndex("Name")));
                autoSevaDetail.setStateID(cursor.getString(cursor.getColumnIndex("StateID")));
                autoSevaCityList.add(autoSevaDetail);
            }
        }
        return autoSevaCityList;
    }

    public String getCountryID(String CountryName) {
        String country_id = "";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT ID FROM Countries WHERE Name='" + CountryName + "'", null);
        if (cursor.moveToFirst()) {
            country_id = cursor.getString(0);
        }
        return country_id;
    }

    public String getStateID(String StateName) {
        String state_id = "";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT ID FROM States WHERE Name='" + StateName + "'", null);
        if (cursor.moveToFirst()) {
            state_id = cursor.getString(0);
        }
        return state_id;
    }

    public void CopyDataBaseFromAsset() throws IOException {

        InputStream myInput = ctx.getAssets().open(DATABASE_NAME);

        // Path to the just created empty db
        String outFileName = getDatabasePath();

        // if the path doesn't exist first, create it
        File f = new File(ctx.getApplicationInfo().dataDir + DB_PATH_SUFFIX);
        if (!f.exists())
            f.mkdir();

        // Open the empty db as the output stream
        OutputStream myOutput = new FileOutputStream(outFileName);

        // transfer bytes from the inputfile to the outputfile
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        // Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();

    }

    public SQLiteDatabase openDataBase() throws SQLException {
        File dbFile = ctx.getDatabasePath(DATABASE_NAME);

        if (!dbFile.exists()) {
            try {
                CopyDataBaseFromAsset();
                System.out.println("Copying sucess from Assets folder");
            } catch (IOException e) {
                throw new RuntimeException("Error creating source database", e);
            }
        }

        return SQLiteDatabase.openDatabase(dbFile.getPath(), null, SQLiteDatabase.NO_LOCALIZED_COLLATORS | SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }
}


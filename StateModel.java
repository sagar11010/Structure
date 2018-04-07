package com.app.nrisamajuser.database;

/**
 * Created by shivlab-android on 1/8/17.
 */

public class StateModel {
    String ID,name,countryID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "StateModel{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", countryID='" + countryID + '\'' +
                '}';
    }
}

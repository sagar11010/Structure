package com.app.nrisamajuser.database;

/**
 * Created by shivlab-android on 1/8/17.
 */

public class Countries {


    String id,name,sortname,phonecode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public String getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(String phonecode) {
        this.phonecode = phonecode;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sortname='" + sortname + '\'' +
                ", phonecode='" + phonecode + '\'' +
                '}';
    }
}

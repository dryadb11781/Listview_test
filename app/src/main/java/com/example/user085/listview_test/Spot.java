package com.example.user085.listview_test;

/**
 * Created by user085 on 2016/11/1.
 */
public class Spot {

    private int imageID;
    private String name;
    private  String phone;
    public Spot(int imageID, String name, String phone) {
        this.imageID = imageID;
        this.name = name;
        this.phone = phone;
    }



    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }





}

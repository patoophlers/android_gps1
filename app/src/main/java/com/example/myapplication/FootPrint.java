package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class FootPrint {

    @SerializedName("userId")
    private int lat;

    @SerializedName("title")
    private String msg;

    public int getLat() {
        return lat;
    }

    public String getMsg() {
        return msg;
    }
}

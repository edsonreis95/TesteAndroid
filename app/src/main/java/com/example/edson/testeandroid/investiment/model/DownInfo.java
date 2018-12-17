package com.example.edson.testeandroid.investiment.model;

import com.google.gson.annotations.SerializedName;

public class DownInfo {

    @SerializedName("name")
    String name;
    @SerializedName("data")
    String data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

package com.example.edson.testeandroid.investiment.model;

import com.google.gson.annotations.SerializedName;

public class FundResponse {

    @SerializedName("screen")
    Fund screen;

    public Fund getScreen() {
        return screen;
    }

    public void setScreen(Fund screen) {
        this.screen = screen;
    }

}

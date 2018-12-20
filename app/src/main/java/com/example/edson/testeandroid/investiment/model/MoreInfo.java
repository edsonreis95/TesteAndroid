package com.example.edson.testeandroid.investiment.model;

import com.google.gson.annotations.SerializedName;

public class MoreInfo {

    @SerializedName("month")
    MoreInfoDetail month;
    @SerializedName("year")
    MoreInfoDetail year;
    @SerializedName("12months")
    MoreInfoDetail months12;

    public MoreInfoDetail getMonth() {
        return month;
    }

    public void setMonth(MoreInfoDetail month) {
        this.month = month;
    }

    public MoreInfoDetail getYear() {
        return year;
    }

    public void setYear(MoreInfoDetail year) {
        this.year = year;
    }

    public MoreInfoDetail getMonths12() {
        return months12;
    }

    public void setMonths12(MoreInfoDetail months12) {
        this.months12 = months12;
    }

}

package com.example.edson.testeandroid.investiment.model;

import com.google.gson.annotations.SerializedName;

public class MoreInfoDetail {
    @SerializedName("fund")
    Double fund;
    @SerializedName("CDI")
    Double CDI;

    public Double getFund() {
        return fund;
    }

    public void setFund(Double fund) {
        this.fund = fund;
    }

    public Double getCDI() {
        return CDI;
    }

    public void setCDI(Double CDI) {
        this.CDI = CDI;
    }
}

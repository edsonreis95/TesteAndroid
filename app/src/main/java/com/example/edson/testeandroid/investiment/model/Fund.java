package com.example.edson.testeandroid.investiment.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Fund {

    @SerializedName("title")
    private String title;
    @SerializedName("fundName")
    private String fundName;
    @SerializedName("whatIs")
    private String whatIs;
    @SerializedName("definition")
    private String definition;
    @SerializedName("riskTitle")
    private String riskTitle;
    @SerializedName("risk")
    private Integer risk;
    @SerializedName("infoTitle")
    private String infoTitle;
    @SerializedName("moreInfo")
    private MoreInfo moreInfo;
    @SerializedName("info")
    private List<Info> info;
    @SerializedName("downInfo")
    private List<DownInfo> downInfo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public Integer getRisk() {
        return risk;
    }

    public void setRisk(Integer risk) {
        this.risk = risk;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public List<DownInfo> getDownInfo() {
        return downInfo;
    }

    public void setDownInfo(List<DownInfo> downInfo) {
        this.downInfo = downInfo;
    }
}

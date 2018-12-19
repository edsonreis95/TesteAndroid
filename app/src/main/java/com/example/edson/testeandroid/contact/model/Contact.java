package com.example.edson.testeandroid.contact.model;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("id")
    Integer id;
    @SerializedName("type")
    Integer type;
    @SerializedName("message")
    String message;
    @SerializedName("typefield")
    Object typefield;
    @SerializedName("hidden")
    Boolean hidden;
    @SerializedName("topSpacing")
    Double topSpacing;
    @SerializedName("show")
    Integer show;
    @SerializedName("required")
    Boolean required;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getTypefield() {
        return typefield;
    }

    public void setTypefield(Integer typefield) {
        this.typefield = typefield;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Double getTopSpacing() {
        return topSpacing;
    }

    public void setTopSpacing(Double topSpacing) {
        this.topSpacing = topSpacing;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
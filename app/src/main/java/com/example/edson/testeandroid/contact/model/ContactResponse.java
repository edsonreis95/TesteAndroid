package com.example.edson.testeandroid.contact.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactResponse {

    @SerializedName("cells")
    List<Contact> cells;

    public List<Contact> getCells() {
        return cells;
    }

    public void setCells(List<Contact> cells) {
        this.cells = cells;
    }
}

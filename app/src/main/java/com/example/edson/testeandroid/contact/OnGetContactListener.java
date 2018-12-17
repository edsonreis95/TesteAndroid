package com.example.edson.testeandroid.contact;

public interface OnGetContactListener {

    void onGetContactSuccess(ContactResponse response);
    void onGetContactError(Throwable e);
}

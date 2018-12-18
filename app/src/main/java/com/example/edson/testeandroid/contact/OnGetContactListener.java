package com.example.edson.testeandroid.contact;

import com.example.edson.testeandroid.contact.model.ContactResponse;

public interface OnGetContactListener {

    void onGetContactSuccess(ContactResponse response);
    void onGetContactError(Throwable e);
}

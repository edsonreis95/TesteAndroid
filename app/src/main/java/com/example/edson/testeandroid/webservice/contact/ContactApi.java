package com.example.edson.testeandroid.webservice.contact;

import com.example.edson.testeandroid.contact.model.ContactResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface ContactApi {

    @GET("/cells.json")
    Observable<ContactResponse> getContact();
}

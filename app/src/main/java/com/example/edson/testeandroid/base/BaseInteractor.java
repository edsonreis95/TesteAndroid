package com.example.edson.testeandroid.base;

import com.example.edson.testeandroid.webservice.contact.ContactApi;
import com.example.edson.testeandroid.webservice.investiment.InvestimentApi;
import com.example.edson.testeandroid.webservice.ApiManager;

public class BaseInteractor {

    public ContactApi getContactApi(){
        return ApiManager.getInstance().getApiInstance().create(ContactApi.class);
    }

    public InvestimentApi getInvestimentApi(){
        return ApiManager.getInstance().getApiInstance().create(InvestimentApi.class);
    }
}

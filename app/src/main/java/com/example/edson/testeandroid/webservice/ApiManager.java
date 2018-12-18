package com.example.edson.testeandroid.webservice;

import com.example.edson.testeandroid.application.ApplicationConstants;

import retrofit2.Retrofit;

public class ApiManager {
    private static final ApiManager ourInstance = new ApiManager();

    public static ApiManager getInstance() {
        return ourInstance;
    }

    private ApiManager() {
    }

    public Retrofit getApiInstance() {
        return ServiceFactory.createService(ApplicationConstants.SANTANDER_BASE_URL);
    }
}

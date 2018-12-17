package com.example.edson.testeandroid.webservice;

public class ApiManager {

    public static final String SANTANDER_BASE_URL = "https://floating-mountain-50292.herokuapp.com";
    private static final ApiManager ourInstance = new ApiManager();

    public static ApiManager getInstance() {
        return ourInstance;
    }

    private ApiManager() {
    }

    public SantanderApi getSantanderApiInstance() {
        return SantanderServiceFactory.createSantanderService(SANTANDER_BASE_URL);
    }
}

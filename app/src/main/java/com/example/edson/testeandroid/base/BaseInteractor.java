package com.example.edson.testeandroid.base;

public class BaseInteractor {

    public SantanderApi getSantanderApi(){
        return ApiManager.getInstance().getSantanderApiInstance();
    }
}

package com.example.edson.testeandroid.webservice;


import retrofit2.http.GET;

interface SantanderApi {

    @GET("/cells.json")
    Observable<ContactResponse> getContact();

    @GET("/fund.json")
    Observable<FundResponse> getInvestiment();
}

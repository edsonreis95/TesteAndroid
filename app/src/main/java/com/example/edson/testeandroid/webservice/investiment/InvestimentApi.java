package com.example.edson.testeandroid.webservice.investiment;

import com.example.edson.testeandroid.investiment.model.FundResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface InvestimentApi {

    @GET("/fund.json")
    Observable<FundResponse> getInvestiment();
}

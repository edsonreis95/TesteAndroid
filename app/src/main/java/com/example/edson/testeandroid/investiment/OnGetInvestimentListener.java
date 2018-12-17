package com.example.edson.testeandroid.investiment;


import com.example.edson.testeandroid.investiment.model.FundResponse;

public interface OnGetInvestimentListener {

    void onGetInvestimentSuccess(FundResponse response);
    void onGetInvestimentError(Throwable e);
}


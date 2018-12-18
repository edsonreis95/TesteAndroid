package com.example.edson.testeandroid.investiment;


import com.example.edson.testeandroid.base.BaseInteractor;
import com.example.edson.testeandroid.investiment.model.FundResponse;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class InvestimentInteractor extends BaseInteractor {

    public void getInvestiment(final OnGetInvestimentListener listener){

        getInvestimentApi().getInvestiment()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<FundResponse>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onGetInvestimentError(e);
                    }

                    @Override
                    public void onNext(FundResponse response) {
                        listener.onGetInvestimentSuccess(response);
                    }
                });
    }
}

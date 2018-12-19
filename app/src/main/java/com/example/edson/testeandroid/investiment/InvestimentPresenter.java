package com.example.edson.testeandroid.investiment;

import com.example.edson.testeandroid.base.IBasePresenter;
import com.example.edson.testeandroid.investiment.model.FundResponse;
import com.example.edson.testeandroid.utils.ConnectionUtils;

import retrofit2.adapter.rxjava.HttpException;


public class InvestimentPresenter implements IBasePresenter, OnGetInvestimentListener {

    private IInvestimentView view;
    private InvestimentInteractor interactor;

    public InvestimentPresenter(IInvestimentView view) {
        this.view = view;
        this.interactor = new InvestimentInteractor();
        this.view.setPresenter(this);
    }

    @Override
    public void start() {
        view.showProgress();
        interactor.getInvestiment(this);
    }

    @Override
    public void onGetInvestimentSuccess(FundResponse response) {
        view.hideProgress();
        view.loadInvestimentLayout(response);
    }

    @Override
    public void onGetInvestimentError(Throwable e) {
        view.hideProgress();
        view.showError(((HttpException)e).code());
    }
}

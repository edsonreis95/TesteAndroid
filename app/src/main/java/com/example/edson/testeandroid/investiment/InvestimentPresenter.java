package com.example.edson.testeandroid.investiment;

import com.example.edson.testeandroid.base.IBasePresenter;


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
        interactor.getInvestiment(this);
    }

    @Override
    public void onGetInvestimentSuccess(FundResponse response) {

    }

    @Override
    public void onGetInvestimentError(Throwable e) {

    }
}

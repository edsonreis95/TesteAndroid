package com.example.edson.testeandroid.investiment;

import com.example.edson.testeandroid.base.IBaseFragmentView;
import com.example.edson.testeandroid.investiment.model.FundResponse;

public interface IInvestimentView extends IBaseFragmentView {

    void setPresenter(InvestimentPresenter presenter);
    void showError(int errorCode);
    void loadInvestimentLayout(FundResponse response);
}

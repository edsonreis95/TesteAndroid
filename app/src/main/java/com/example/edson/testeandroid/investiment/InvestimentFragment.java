package com.example.edson.testeandroid.investiment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.edson.testeandroid.CustomButton;
import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.base.BaseFragment;
import com.example.edson.testeandroid.investiment.model.FundResponse;
import com.example.edson.testeandroid.investiment.view.DownInfoLayout;
import com.example.edson.testeandroid.investiment.view.HeaderLayout;
import com.example.edson.testeandroid.investiment.view.InfoLayout;
import com.example.edson.testeandroid.investiment.view.MoreInfoLayout;
import com.example.edson.testeandroid.investiment.view.RiskLayout;
import com.example.edson.testeandroid.utils.ConnectionUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InvestimentFragment extends BaseFragment implements IInvestimentView {

    InvestimentPresenter presenter;

    @BindView(R.id.lnInvestiment)
    LinearLayout lnInvestiment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_investiment, container, false);

        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        presenter = new InvestimentPresenter(this);
    }

    @Override
    public void setPresenter(InvestimentPresenter presenter) {
        presenter.start();
    }

    @Override
    public void showError(int errorCode) {
        showToastMessage(ConnectionUtils.getConnectionMessageError(errorCode));
    }

    @Override
    public void loadInvestimentLayout(FundResponse response) {
        lnInvestiment.addView(new HeaderLayout(getContext(), response));
        lnInvestiment.addView(new RiskLayout(getContext(), response));
        lnInvestiment.addView(new MoreInfoLayout(getContext(), response));
        lnInvestiment.addView(new InfoLayout(getContext(), response));
        lnInvestiment.addView(new DownInfoLayout(getContext(), response));
        lnInvestiment.addView(createCustomButtom());

    }

    @Override
    public Button createCustomButtom() {
        return new CustomButton(getContext())
                .newInstance()
                .setText("Investir")
                .setTextColor(getContext().getResources().getColor(R.color.white))
                .setTextSize(16)
                .isAllCaps(false)
                .setBackgroundColor(R.drawable.button_selector)
                .setListener(onClicButtonInvestiment())
                .create();
    }

    @Override
    public View.OnClickListener onClicButtonInvestiment() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastMessage("Investido");
            }
        };
    }
}

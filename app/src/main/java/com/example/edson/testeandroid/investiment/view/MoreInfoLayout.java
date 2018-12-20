package com.example.edson.testeandroid.investiment.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.FundResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoreInfoLayout extends ConstraintLayout {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvFundMonth)
    TextView tvFundMonth;
    @BindView(R.id.tvCdiMonth)
    TextView tvCdiMonth;
    @BindView(R.id.tvFundYear)
    TextView tvFundYear;
    @BindView(R.id.tvCdiYear)
    TextView tvCdiYear;
    @BindView(R.id.tvFundMonth12)
    TextView tvFundMonth12;
    @BindView(R.id.tvCdiMonth12)
    TextView tvCdiMonth12;

    public MoreInfoLayout(Context context, FundResponse response) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_investiment_more_info, this, true);

        ButterKnife.bind(this);

        setMoreInfoTitle(response.getScreen().getInfoTitle());
        setFundMonth(response.getScreen().getMoreInfo().getMonth().getFund());
        setCdiMonth(response.getScreen().getMoreInfo().getMonth().getCDI());
        setFundYear(response.getScreen().getMoreInfo().getYear().getFund());
        setCdiYear(response.getScreen().getMoreInfo().getYear().getCDI());
        setFundMonth12(response.getScreen().getMoreInfo().getMonths12().getFund());
        setCdiMonth12(response.getScreen().getMoreInfo().getMonths12().getCDI());
    }

    private void setMoreInfoTitle(String title){
        tvTitle.setText(title);
    }

    private void setFundMonth(Double fundMonth){
        tvFundMonth.setText(String.valueOf(fundMonth));
    }

    private void setCdiMonth(Double cdiMonth){
        tvCdiMonth.setText(String.valueOf(cdiMonth));
    }

    private void setFundYear(Double fundYear){
        tvFundYear.setText(String.valueOf(fundYear));
    }

    private void setCdiYear(Double cdiYear){
        tvCdiYear.setText(String.valueOf(cdiYear));
    }

    private void setFundMonth12(Double fundMonth12){
        tvFundMonth12.setText(String.valueOf(fundMonth12));
    }

    private void setCdiMonth12(Double cdiMonth12){
        tvCdiMonth12.setText(String.valueOf(cdiMonth12));
    }
}


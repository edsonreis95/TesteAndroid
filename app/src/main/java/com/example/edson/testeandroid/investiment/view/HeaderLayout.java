package com.example.edson.testeandroid.investiment.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.FundResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HeaderLayout extends LinearLayout {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvFundName)
    TextView tvFundName;
    @BindView(R.id.tvWhatIs)
    TextView tvWhatIs;
    @BindView(R.id.tvDefinition)
    TextView tvDefinition;

    public HeaderLayout(Context context, FundResponse response) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_investiment_header, this, true);

        ButterKnife.bind(this);

        setTvTitle(response.getScreen().getTitle());
        setTvFundName(response.getScreen().getFundName());
        setTvWhatIs(response.getScreen().getWhatIs());
        setTvDefinition(response.getScreen().getDefinition());
    }

    public void setTvTitle(String title){
        tvTitle.setText(title);
    }

    public void setTvFundName(String fundName){
        tvFundName.setText(fundName);
    }

    public void setTvDefinition(String definition){
        tvDefinition.setText(definition);
    }

    public void setTvWhatIs(String whatIs){
        tvWhatIs.setText(whatIs);
    }
}

package com.example.edson.testeandroid.ui.investiment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.FundResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RiskLayout extends LinearLayout {

    @BindView(R.id.tvRisk)
    TextView tvRisk;
    @BindView(R.id.ivArrow1)
    ImageView ivArrow1;
    @BindView(R.id.ivArrow2)
    ImageView ivArrow2;
    @BindView(R.id.ivArrow3)
    ImageView ivArrow3;
    @BindView(R.id.ivArrow4)
    ImageView ivArrow4;
    @BindView(R.id.ivArrow5)
    ImageView ivArrow5;
    @BindView(R.id.viewRisk1)
    View viewRisk1;
    @BindView(R.id.viewRisk2)
    View viewRisk2;
    @BindView(R.id.viewRisk3)
    View viewRisk3;
    @BindView(R.id.viewRisk4)
    View viewRisk4;
    @BindView(R.id.viewRisk5)
    View viewRisk5;


    public RiskLayout(Context context, FundResponse response) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_investiment_risk, this, true);

        ButterKnife.bind(this);

        setRiskTitle(response.getScreen().getRiskTitle());
        setRiskArrow(response.getScreen().getRisk());
        changeRiskViewSize(response.getScreen().getRisk());
    }

    public void setRiskTitle(String title){
        tvRisk.setText(title);
    }

    public void setRiskArrow(int risk){
        switch (risk){
            case 1:
                ivArrow1.setImageResource(R.drawable.ic_arrow);
                break;
            case 2:
                ivArrow2.setImageResource(R.drawable.ic_arrow);
                break;
            case 3:
                ivArrow3.setImageResource(R.drawable.ic_arrow);
                break;
            case 4:
                ivArrow4.setImageResource(R.drawable.ic_arrow);
                break;
            case 5:
                ivArrow5.setImageResource(R.drawable.ic_arrow);
                break;
        }
    }

    public void changeRiskViewSize(int risk){
        switch (risk){
            case 1:
                viewRisk1.getLayoutParams().height = 37;
                break;
            case 2:
                viewRisk2.getLayoutParams().height = 37;
                break;
            case 3:
                viewRisk3.getLayoutParams().height = 37;
                break;
            case 4:
                viewRisk4.getLayoutParams().height = 37;
                break;
            case 5:
                viewRisk5.getLayoutParams().height = 37;
                break;
        }
    }
}
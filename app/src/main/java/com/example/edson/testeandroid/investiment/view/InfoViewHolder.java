package com.example.edson.testeandroid.investiment.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.edson.testeandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tvName)
    protected TextView tvName;
    @BindView(R.id.tvData)
    protected TextView tvData;

    public InfoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setTvName(String name) {
        tvName.setText(name);
    }

    public void setTvData(String data) {
        tvData.setText(data);
    }
}

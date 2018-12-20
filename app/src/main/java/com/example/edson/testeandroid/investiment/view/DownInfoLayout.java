package com.example.edson.testeandroid.investiment.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.DownInfo;
import com.example.edson.testeandroid.investiment.model.FundResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DownInfoLayout extends ConstraintLayout {

    @BindView(R.id.rvInfo)
    RecyclerView rvInfo;

    public DownInfoLayout(Context context, FundResponse response) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.layout_investiment_down_info, this, true);

        ButterKnife.bind(this);

        configRecyclerView(context);
        populateRecyclerview(response.getScreen().getDownInfo());
    }

    public void configRecyclerView (Context context){
        rvInfo.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        rvInfo.setHasFixedSize(true);
    }

    public void populateRecyclerview (List<DownInfo> downInfos){
        final DownInfoRecyclerAdapter adapter = new DownInfoRecyclerAdapter(downInfos);
        rvInfo.setAdapter(adapter);
    }
}

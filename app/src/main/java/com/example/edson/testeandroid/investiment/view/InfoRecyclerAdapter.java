package com.example.edson.testeandroid.investiment.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.Info;

import java.util.List;

public class InfoRecyclerAdapter extends RecyclerView.Adapter<InfoViewHolder> {
    private List<Info> infos;

    public InfoRecyclerAdapter(List<Info> infos) {
        this.infos =  infos;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_info_item, parent, false);
        return new InfoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final InfoViewHolder holder, int position) {
        Info info = infos.get(position);

        holder.setTvName(info.getName());
        holder.setTvData(info.getData());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }
}


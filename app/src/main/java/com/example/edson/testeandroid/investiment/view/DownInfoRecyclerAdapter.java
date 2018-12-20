package com.example.edson.testeandroid.investiment.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.investiment.model.DownInfo;

import java.util.List;

public class DownInfoRecyclerAdapter extends RecyclerView.Adapter<DownInfoViewHolder> {
    private List<DownInfo> downInfos;

    public DownInfoRecyclerAdapter(List<DownInfo> downInfos) {
        this.downInfos =  downInfos;
    }

    @Override
    public DownInfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_down_info_item, parent, false);
        return new DownInfoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final DownInfoViewHolder holder, int position) {
        final DownInfo downInfo = downInfos.get(position);

        holder.setTvName(downInfo.getName());
        holder.getTvData().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (downInfo.getData() == null || downInfo.getData().equals("")){
                    Toast.makeText(view.getContext(), "Falha ao baixar arquivo.", Toast.LENGTH_LONG);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return downInfos.size();
    }
}
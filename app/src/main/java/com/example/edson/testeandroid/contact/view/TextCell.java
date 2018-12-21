package com.example.edson.testeandroid.contact.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.edson.testeandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TextCell extends ConstraintLayout {

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    public TextCell(Context context) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_text, this, true);

        ButterKnife.bind(this);
    }



    public TextCell setIdentifier(int id){
        tvMessage.setId(id);
        return this;
    }

    public TextCell isVisible(boolean isVisible){
        if (!isVisible){
            tvMessage.setVisibility(GONE);
        }
        return this;
    }

    public TextCell setMessage(String message){
        tvMessage.setText(message);
        return this;
    }

    public TextCell setMargin(Double margin){
        tvMessage.setPadding(0,10,0,0);
        return this;
    }

    public TextView build(){
        return tvMessage;
    }
}

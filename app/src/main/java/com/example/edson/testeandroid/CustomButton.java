package com.example.edson.testeandroid;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

public class CustomButton {

    public static Button button;
    public Context context;

    public CustomButton(Context context){
        this.context = context;
    }

    public CustomButton newInstance(){
        button = new Button(context);
        return this;
    }

    public CustomButton setText(String text) {
        button.setText(text);
        return this;
    }

    public CustomButton setTextColor(int color) {
        button.setTextColor(color);
        return this;
    }

    public CustomButton setTextSize(int size){
        button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, size);
        return this;
    }

    public CustomButton isAllCaps(boolean allCaps) {
        if (!allCaps){
            button.setAllCaps(false);
        }
        return this;
    }

    public CustomButton setBackgroundColor(int color){
        button.setBackgroundResource(color);
        return this;
    }

    public CustomButton setListener(View.OnClickListener listener){
        button.setOnClickListener(listener);
        return this;
    }

    public Button create() {
        return button;
    }
}

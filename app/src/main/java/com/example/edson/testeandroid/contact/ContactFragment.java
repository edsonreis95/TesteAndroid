package com.example.edson.testeandroid.contact;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.base.BaseFragment;
import com.example.edson.testeandroid.utils.ConnectionUtils;

import butterknife.ButterKnife;

public class ContactFragment extends BaseFragment implements IContactView {

    ContactPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        ButterKnife.bind((Activity) view.getContext());

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        presenter = new ContactPresenter(this);
    }

    @Override
    public void setPresenter(ContactPresenter presenter) {
        presenter.start();
    }

    @Override
    public void showError(int errorCode) {
        showToastMessage(ConnectionUtils.getConnectionMessageError(errorCode));
    }

    @Override
    public void loadContactLayout() {
    }
}

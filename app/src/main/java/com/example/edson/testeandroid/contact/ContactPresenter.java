package com.example.edson.testeandroid.contact;


import com.example.edson.testeandroid.base.IBasePresenter;
import com.example.edson.testeandroid.contact.model.ContactResponse;
import com.example.edson.testeandroid.utils.ConnectionUtils;

import retrofit2.adapter.rxjava.HttpException;

public class ContactPresenter implements IBasePresenter, OnGetContactListener {

    private IContactView view;
    private ContactInteractor interactor;

    public ContactPresenter(IContactView view) {
        this.view = view;
        this.interactor = new ContactInteractor();
        this.view.setPresenter(this);
    }

    @Override
    public void start() {
        view.showProgress();
        interactor.getContact(this);
    }

    @Override
    public void onGetContactSuccess(ContactResponse response) {
        view.hideProgress();
    }

    @Override
    public void onGetContactError(Throwable e) {
        int errorCode = ((HttpException)e).code();

        view.hideProgress();
        view.showToastMessage(ConnectionUtils.getConnectionMessageError(errorCode);
    }
}

package com.example.edson.testeandroid.contact;

import com.example.edson.testeandroid.base.IBasePresenter;
import com.example.edson.testeandroid.contact.model.Contact;
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
        for (Contact contact : response.getCells())
        view.loadContactLayout(contact);
    }

    @Override
    public void onGetContactError(Throwable e) {
        view.showError(((HttpException)e).code());
        view.hideProgress();
    }
}

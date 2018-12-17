package com.example.edson.testeandroid.contact;


import com.example.edson.testeandroid.base.IBasePresenter;

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
        interactor.getContact(this);
    }

    @Override
    public void onGetContactSuccess(ContactResponse response) {

    }

    @Override
    public void onGetContactError(Throwable e) {

    }
}

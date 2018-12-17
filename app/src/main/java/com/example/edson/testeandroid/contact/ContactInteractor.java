package com.example.edson.testeandroid.contact;

import com.example.edson.testeandroid.base.BaseInteractor;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ContactInteractor extends BaseInteractor {

    public void getContact(final OnGetContactListener listener){

        getSantanderApi().getContact()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ContactResponse>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onGetContactError(e);
                    }

                    @Override
                    public void onNext(ContactResponse response) {
                        listener.onGetContactSuccess(response);
                    }
                });
    }
}
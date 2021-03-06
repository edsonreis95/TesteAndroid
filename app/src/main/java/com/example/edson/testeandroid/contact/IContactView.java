package com.example.edson.testeandroid.contact;

import com.example.edson.testeandroid.base.IBaseFragmentView;
import com.example.edson.testeandroid.contact.model.Contact;

public interface IContactView extends IBaseFragmentView {

    void setPresenter(ContactPresenter presenter);
    void showError(int errorCode);
    void loadContactLayout(Contact contact);
}

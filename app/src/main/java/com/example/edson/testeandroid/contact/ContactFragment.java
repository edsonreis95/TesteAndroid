package com.example.edson.testeandroid.contact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edson.testeandroid.R;
import com.example.edson.testeandroid.base.BaseFragment;
import com.example.edson.testeandroid.contact.enumeration.EnumType;
import com.example.edson.testeandroid.contact.model.Contact;
import com.example.edson.testeandroid.contact.view.TextCell;
import com.example.edson.testeandroid.utils.ConnectionUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContactFragment extends BaseFragment implements IContactView {

    ContactPresenter presenter;

    @BindView(R.id.lnContact)
    LinearLayout lnContact;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        ButterKnife.bind(this, view);

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
    public void loadContactLayout(Contact contact) {
        if (contact.getType() == EnumType.TEXT.getValue()) {
            TextView textView = new TextCell(getContext())
                    .setIdentifier(contact.getId())
                    .setMessage(contact.getMessage())
                    .setMargin(contact.getTopSpacing())
                    .isVisible(contact.getHidden())
                    .build();

            lnContact.addView(textView);
        }
    }
}

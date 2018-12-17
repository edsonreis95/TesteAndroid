package com.example.edson.testeandroid.contact.model;

public enum TypeField {
    text(1),
    telNumber(2),
    email(3);

    private Object value;

    TypeField(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
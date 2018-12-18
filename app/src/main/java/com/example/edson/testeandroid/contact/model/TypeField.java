package com.example.edson.testeandroid.contact.model;

public enum TypeField {
    TEXT(1),
    TEL_NUMBER(2),
    EMAIL(3);

    private Object value;

    TypeField(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
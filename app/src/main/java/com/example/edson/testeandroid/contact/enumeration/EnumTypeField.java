package com.example.edson.testeandroid.contact.enumeration;

public enum EnumTypeField {
    TEXT(1),
    TEL_NUMBER("telnumber"),
    EMAIL(3);

    private Object value;

    EnumTypeField(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
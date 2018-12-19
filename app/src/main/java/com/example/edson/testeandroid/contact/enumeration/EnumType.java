package com.example.edson.testeandroid.contact.enumeration;

public enum EnumType {
    FIELD(1),
    TEXT(2),
    IMAGE(3),
    CHECKBOX(4),
    SEND(5);

    private int value;

    EnumType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

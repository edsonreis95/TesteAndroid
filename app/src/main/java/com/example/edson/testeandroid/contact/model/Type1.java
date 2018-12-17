package com.example.edson.testeandroid.contact.model;

public enum Type1 {
    field(1),
    text(2),
    image(3),
    checkbox(4),
    send(5);

    private int value;

    Type1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
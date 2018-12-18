package com.example.edson.testeandroid.webservice;

public enum EnumConnection {

    STATUS_OK(200),
    STATUS_NO_CONTENT(204),
    STATUS_CREATED(201),
    STATUS_BAD_REQUEST(400),
    STATUS_UNAUTHORIZED(401),
    STATUS_FORBIDDEN(403),
    STATUS_NOT_FOUND(404),
    STATUS_NOT_ACCEPTABLE(406),
    STATUS_TIMEOUT(408),
    STATUS_CONFLICT(409),
    STATUS_LAST_PAGE(500);

    private int value;

    EnumConnection(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package com.example.edson.testeandroid.utils;

import com.example.edson.testeandroid.webservice.EnumConnection;

public class ConnectionUtils {

    public static final String getConnectionMessageError(int errorCode) {

        if (errorCode == EnumConnection.STATUS_OK.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_NO_CONTENT.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_CREATED.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_BAD_REQUEST.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Bad Request Message";
        } else {
            return "Generic Message";
        }
    }
}

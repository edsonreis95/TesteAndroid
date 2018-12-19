package com.example.edson.testeandroid.utils;

import com.example.edson.testeandroid.webservice.EnumConnection;

public class ConnectionUtils {

    public static final String getConnectionMessageError(int errorCode) {

        if (errorCode == EnumConnection.STATUS_OK.getValue()){
            return "Status Ok Message";
        } else if (errorCode == EnumConnection.STATUS_NO_CONTENT.getValue()){
            return "Status No Content Message";
        } else if (errorCode == EnumConnection.STATUS_CREATED.getValue()){
            return "Status Created Message";
        } else if (errorCode == EnumConnection.STATUS_BAD_REQUEST.getValue()){
            return "Status Bad Request Message";
        } else if (errorCode == EnumConnection.STATUS_UNAUTHORIZED.getValue()){
            return "Status Unauthorized Message";
        } else if (errorCode == EnumConnection.STATUS_FORBIDDEN.getValue()){
            return "Status Forbidden Message";
        } else if (errorCode == EnumConnection.STATUS_NOT_FOUND.getValue()){
            return "Status Not Found Message";
        } else if (errorCode == EnumConnection.STATUS_NOT_ACCEPTABLE.getValue()){
            return "Status Not Acceptable Message";
        } else if (errorCode == EnumConnection.STATUS_TIMEOUT.getValue()){
            return "Status Timeout Message";
        } else if (errorCode == EnumConnection.STATUS_CONFLICT.getValue()){
            return "Status Conflict Message";
        } else if (errorCode == EnumConnection.STATUS_LAST_PAGE.getValue()){
            return "Status Last Page Message";
        } else {
            return "Generic Message";
        }
    }
}

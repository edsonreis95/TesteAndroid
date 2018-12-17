package com.example.edson.testeandroid.utils;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class ValidatorUtils {

    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    public static final Pattern PHONE_PATTERN = Pattern.compile(
            "[a-zA-Z]+"
    );

    public static boolean validationEmail(String email){
        if (!TextUtils.isEmpty(email)){
            return EMAIL_PATTERN.matcher(email).matches();
        }
        return false;
    }

    public static boolean isValidPhone(String phone) {
        if (!TextUtils.isEmpty(phone)){
            if (phone.length() == 10 || phone.length() == 11){
                return PHONE_PATTERN.matcher(phone).matches();
            }
        }
        return false;
    }
}

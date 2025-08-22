package com.example.rainnyapp.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.StrongBoxUnavailableException;

public class SharedPreferencesHelper {
    private static final String PREF_NAME = "LoginPrefs";
    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    private static final String KEY_EMAIL = "email";

    // RemeberMe

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    public SharedPreferencesHelper(Context context){
        sharedPreferences = context.getSharedPreferences(PREF_NAME,context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    // set trang thai dang nhap
    public void setLoggedIn(Boolean isLoggedIn){
        editor.putBoolean(KEY_IS_LOGGED_IN,isLoggedIn);
        editor.apply();
    }

    // kiem tra neu user da danng nhap
    public Boolean isLoggedIn(){
        return sharedPreferences.getBoolean(KEY_IS_LOGGED_IN,false);
    }

}

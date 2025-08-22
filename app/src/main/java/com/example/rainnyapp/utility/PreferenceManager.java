package com.example.rainnyapp.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.number.CompactNotation;

public class PreferenceManager {

    private static final String PREF_NAME = "RainnyAppPreferences";

    // key cho cac gia tri se luu tru
    public static final String KEY_IS_LOGGED_IN = "isLoggedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PROFILE_IMAGE_URL = "profileImageUrl";
    public static final String KEY_BIO = "bio";
    // public static final String KEY_WEBSITE = "website";
    public static final String KEY_FCM_TOKEN = "fcmToken";
    public static final String KEY_ACCESS_TOKEN = "accessToken";
    public static final String KEY_REFRESH_TOKEN = "refreshToken";
    public static final String KEY_NOTIFICATION_ENABLED = "notificationEnabled";
    public static final String KEY_DARK_MODE = "darkMode";
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    //Constructor
    public PreferenceManager(Context context){
        sharedPreferences = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    // luu gia tri boolean
    public void putBoolean(String key,Boolean value){
        editor.putBoolean(key,value);
        editor.apply();
    }
    // lay gia tri cua boolean
    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }
    
    // luu gia tri cua String
    public void putString(String key,String value){
        editor.putString(key,value);
        editor.apply();
    }

    // lay gia tri string
    public String getString(String key){
        return sharedPreferences.getString(key,null);
    }
    public String getString(String key , String defaultValue){
        return sharedPreferences.getString(key,defaultValue);
    }

    // luu gia tri Int
    public void putInt(String key,int value){
        editor.putInt(key,value);
        editor.apply();
    }

    // lay gia tri Int

    public int getInt(String key){
        return sharedPreferences.getInt(key,0);
    }

    public int getInt(String key,int defaultValue){
        return sharedPreferences.getInt(key,defaultValue);
    }


    // luu gia tri long

    // xoa 1 key
    public void remove(String key){
        editor.remove(key);
        editor.apply();
    }

    // xoa tat ca du lieu

    public void clear(){
        editor.clear();
        editor.apply();
    }

    // kiem tra key co ton tai khong
    public boolean contains(String key){
        return sharedPreferences.contains(key);
    }

    // trang thai dang nhap
    public void setLoggedIn(boolean isLoggedIn){
        putBoolean(KEY_IS_LOGGED_IN,isLoggedIn);
    }

    public boolean isLoggedIn(){
        return getBoolean(KEY_IS_LOGGED_IN,false);
    }

    // quan ly thong tin cua user
    public void saveUserData(String userId,String username,String email,String profilePic,String bio){
        putString(KEY_USER_ID,userId);
        putString(KEY_USERNAME,username);
        putString(KEY_EMAIL,email);
        putString(KEY_PROFILE_IMAGE_URL,profilePic);
        putString(KEY_BIO,bio);
    }

    public String getUserId(){
        return getString(KEY_USER_ID);
    }
    public String getUserName(){
        return getString(KEY_USERNAME);
    }
    public String getEmail(){
        return getString(KEY_EMAIL);
    }
    public String getProfilePic(){
        return getString(KEY_PROFILE_IMAGE_URL);
    }
    public String getBio(){
        return getString(KEY_BIO);
    }

    // quan ly token
    public void setAccessToken(String token){
        putString(KEY_ACCESS_TOKEN,token);
    }
    public String getAccessToken(){
        return getString(KEY_ACCESS_TOKEN);
    }
    public void setRefreshToken(String token){
        putString(KEY_REFRESH_TOKEN,token);
    }
    public String getRefreshToken(){
        return getString(KEY_REFRESH_TOKEN);
    }

    // FCM token cho notification

    public void setFcmToken(String token){
        putString(KEY_FCM_TOKEN,token);
    }

    public String getFcmToken(){
        return getString(KEY_FCM_TOKEN);
    }

    //quan ly cai dat notification
    public void setNotificationEnabled(boolean enabled){
        putBoolean(KEY_NOTIFICATION_ENABLED,enabled);
    }
    public boolean isNotificationEnabled(){
        return getBoolean(KEY_NOTIFICATION_ENABLED,true);
    }

    // Dark Mode
    public void setDarkMode(boolean enabled){
        putBoolean(KEY_DARK_MODE,enabled);
    }
    public boolean isDarkModeEnable(){
        return getBoolean(KEY_DARK_MODE,false);
    }

    //Get User infomation for Debugging
    public String getUserInfo(){
        return "UserID: " + getUserId() +
                ", Username: " + getUserName() +
                ", Email: " + getEmail() +
                ", ProfileImage: " + getProfilePic() +
                ",Bio:" + getBio();
    }

}

package com.latihanandroid.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsHelper {
    private final String APPNAME = "LATIHANANDREAS";
    private final String KEYLOGIN = "statuslogin";
    private final String KEYNAMA ="Nama";

    //membuat variable
    SharedPreferences sharedPreferences;
    Context ctx;

    //membuat private constructor
    private PrefsHelper(Context ctx) {
        this.ctx = ctx;
        this.sharedPreferences = ctx.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);
    }

    private static PrefsHelper instance;
    public static PrefsHelper sharedInstance(Context ctx) {
        if (instance == null) {
            instance = new PrefsHelper(ctx);
        }
        return instance;
    }
    //digunakan untuk menyimpan status login
    public void setStatusLogin(boolean statusLogin){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(KEYLOGIN, statusLogin);
        editor.apply();
    }

    //digunakan untuk mengecek status login
    public boolean getStatusLogin() {
        return sharedPreferences.getBoolean(KEYLOGIN, false);
    }
    public void setNama (String nama){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEYNAMA,nama);
        editor.apply();
    }
    public String getNama(){
        return sharedPreferences.getString(KEYNAMA, "" );
    }
}
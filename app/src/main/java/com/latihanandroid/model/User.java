package com.latihanandroid.model;

import android.content.Context;
import android.widget.Toast;

public class User {
    //konsep enskapsulasi
    private String namaUser;//konsep dinamakan camel case
    private String alamatUser;
    private int usiaUser;


public User(){
    //constructor default
}

//constructor buatan sendiri
    public User (String namaUser,String alamatUser,int usiaUser){
      this.namaUser=namaUser;
      this.alamatUser=alamatUser;
      this.usiaUser=usiaUser;
    }



    //tipe data primitif
    int contohInt =0;
    double contohdouble = 0.0;
    float contohfoat = 0.0f;
    char contohchar ='L';
    boolean contohboolean = false;
    byte contohbyte = 8;
    short contohshort = 0;
    long contohlong = 100L;

    public void setNamaUser(String nama){
        namaUser = nama;
    }
    public String getNamaUser(){
        return namaUser;
    }
    //alamat user
    public void setAlamatUser(String alamatUser){
        this.alamatUser =alamatUser;
    }
    public String getAlamatUser(){
        return alamatUser;
    }
    //usia user
    public  void setUsiaUser(int usia){
        usiaUser=usia;
    }
    public int getUsiaUser(){
        return usiaUser;
    }

    public void showInfo(Context ctx){
        Toast.makeText(ctx, "random massage", Toast.LENGTH_SHORT).show();
    }
    //overloading dari method show info
    public void showInfo(Context ctx, String info){
        Toast.makeText(ctx,info, Toast.LENGTH_SHORT).show();
    }

}

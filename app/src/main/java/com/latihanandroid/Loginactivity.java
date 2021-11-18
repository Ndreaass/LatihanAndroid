package com.latihanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.latihanandroid.helper.PrefsHelper;
import com.latihanandroid.model.User;

public class Loginactivity extends AppCompatActivity {
    EditText etemail,etpassword;
    AppCompatButton btnlogin;
    private final String email = "ndreas@gmail.com";
    private final String password = "password123";
    private  final  String Nama = "nama";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etemail= findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail,pass;
                mail = etemail.getText().toString();
                pass = etpassword.getText().toString();

                if(mail.equals(email) && pass.equals(password)){
                    Toast.makeText(Loginactivity.this,
                            "Login Berhasil",Toast.LENGTH_SHORT).show();
                    PrefsHelper.sharedInstance(Loginactivity.this).setStatusLogin(true);
                    PrefsHelper.sharedInstance(Loginactivity.this).setNama("saputra");


                    Intent intentPindah = new Intent(Loginactivity.this,
                            MainActivity.class);
                    startActivity(intentPindah);
                    finish();

                }else{
                    Toast.makeText( Loginactivity.this,
                            "Login Gagal email/pass tidak sesuai",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
      boolean statuslogin = PrefsHelper.sharedInstance(Loginactivity.this).getStatusLogin();
      if (statuslogin){
          Intent intentpindah = new Intent(Loginactivity.this,
                  MainActivity.class);
          PrefsHelper.sharedInstance(this).setNama("saputra");
          startActivity(intentpindah);
          finish();
      }

    }
}

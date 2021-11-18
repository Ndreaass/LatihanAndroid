package com.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.latihanandroid.helper.PrefsHelper;
import com.latihanandroid.model.User;

public class MainActivity extends AppCompatActivity {
    TextView tvNama;
    ImageView contohlogout,contohClickUser,contohlagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNama = findViewById(R.id.tvNama);
        contohlogout=findViewById(R.id.contohlogout);
        contohlagi=findViewById(R.id.contohlagi);
        contohClickUser=findViewById(R.id.contohClickUser);
        String nama= PrefsHelper.sharedInstance(MainActivity.this).getNama();
        tvNama.setText(nama);

        contohlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrefsHelper.sharedInstance(MainActivity.this).setStatusLogin(false);
                Intent intent = new Intent(MainActivity.this, Loginactivity.class);
                startActivity(intent);
                finish();
            }
        });

        User user = new User();
        user.setNamaUser("Andreas");
        user.setAlamatUser("Jauh Banget");
        user.setUsiaUser(19);

        contohClickUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "nama saya adalah:"+user.getNamaUser(), Toast.LENGTH_SHORT).show();
            }
        });

        User user2= new User("Andreas saputra","Jauh sekali",19);

        contohlagi.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "nama saya adalah:"+user2.getNamaUser(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

}
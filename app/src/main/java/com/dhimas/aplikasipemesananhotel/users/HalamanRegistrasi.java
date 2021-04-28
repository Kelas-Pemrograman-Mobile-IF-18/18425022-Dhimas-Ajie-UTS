package com.dhimas.aplikasipemesananhotel.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dhimas.aplikasipemesananhotel.R;
import com.ornach.nobobutton.NoboButton;

public class HalamanRegistrasi extends AppCompatActivity {

    NoboButton BtnRegistrasi, BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_registrasi);
        getSupportActionBar().hide();

        BtnRegistrasi = (NoboButton) findViewById(R.id.BtnRegistrasi);
        BtnLogin = (NoboButton) findViewById(R.id.BtnLogin);

        BtnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HalamanRegistrasi.this, HalamanLogin.class);
                startActivity(i);
                finish();
            }
        });

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HalamanRegistrasi.this, HalamanLogin.class);
                startActivity(i);
                finish();
            }
        });
    }
}
package com.dhimas.aplikasipemesananhotel.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dhimas.aplikasipemesananhotel.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }
}
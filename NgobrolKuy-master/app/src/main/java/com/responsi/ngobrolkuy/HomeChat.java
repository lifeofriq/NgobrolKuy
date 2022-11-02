package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeChat extends AppCompatActivity {

    Button btnSettings, btnPersonal, Keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
        btnPersonal = (Button) findViewById(R.id.btnPersonal);
        Keluar =(Button) findViewById(R.id.Keluar);\
        btnSettings = (Button) findViewById(R.id.btnSettings)

        Keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Keluar = new Intent(HomeChat.this, LoginActivity.class);
            }
        });

        btnPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Personal = new Intent(HomeChat.this, PersonalChat.class);
            }
        });

        btnSettings.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Settings = new Intent(HomeChat.this, Settings.class);
            }
        }));


    }
}
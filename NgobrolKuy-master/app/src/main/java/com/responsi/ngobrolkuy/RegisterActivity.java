package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
Button btnLogin2, btnRegis2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnLogin2 = (Button) findViewById(R.id.btnLogin2);
        btnRegis2 = (Button) findViewById(R.id.btnRegis2);

    btnLogin2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent login2 = new Intent(RegisterActivity.this, LoginActivity.class);
        }
    });

    btnRegis2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent regis2 = new Intent(RegisterActivity.this, LoginActivity.class);
        }
    });
    }
}
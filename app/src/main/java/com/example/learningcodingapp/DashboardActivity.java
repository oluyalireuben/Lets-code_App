package com.example.learningcodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    Button btnDsa, btnJava, btnpython, btnLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnDsa  = findViewById(R.id.btnDSA);
        btnJava = findViewById(R.id.btnLearnJava);
        btnpython = findViewById(R.id.btnLearnPython);
        btnLogOut = findViewById(R.id.btnLogout);

        btnDsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DSAActivity.class));
            }
        });

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LearnJavaActivity.class));
            }
        });

        btnpython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LearnPythonActivity.class));
            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });


    }
}
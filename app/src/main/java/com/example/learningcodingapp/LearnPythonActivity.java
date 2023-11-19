package com.example.learningcodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LearnPythonActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_python);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://programiz.pro/");
    }
}
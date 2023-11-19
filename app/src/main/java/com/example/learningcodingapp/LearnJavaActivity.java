package com.example.learningcodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class LearnJavaActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_java);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.learnjavaonline.org/");
    }
}
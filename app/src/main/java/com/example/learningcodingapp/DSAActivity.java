package com.example.learningcodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DSAActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsaactivity);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.geeksforgeeks.org/data-structures-and-algorithms-online-courses-free-and-paid/");
    }
}
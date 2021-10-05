package com.example.mnuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class umbActivity extends AppCompatActivity {
    WebView lcWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umb);

        lcWeb = (WebView) findViewById(R.id.webUmb);
        WebSettings webSettings = lcWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        lcWeb.loadUrl("https://umbvirtual.edu.co");
    }

    public void UmbInicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

}
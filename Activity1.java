package com.aglenpol.simpleloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {
    private Button button;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button = (Button) findViewById(R.id.wstecz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wstecz();
            }
        });

        web = findViewById(R.id.webView);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        web.loadUrl("https://slaska.policja.gov.pl/");
    }
    public void wstecz() {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}
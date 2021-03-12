package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class JavaTpointWebsite extends AppCompatActivity {



        WebView webViewJavaTpointWebsite;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_java_tpoint_website);

            webViewJavaTpointWebsite=findViewById(R.id.webViewJavaTpointWebstie);

            webViewJavaTpointWebsite.getSettings().setJavaScriptEnabled(true);  // enable images

            webViewJavaTpointWebsite.setWebViewClient(new WebViewClient()); // view as a client inside the app

            webViewJavaTpointWebsite.loadUrl("https://www.javatpoint.com/"); //load url
        }
    }
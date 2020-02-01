package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class CompileActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compile);
        Intent intent = getIntent();
        String Code = intent.getStringExtra("CODE");
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("https://www.onlinegdb.com/online_c_compiler");
        webView.loadUrl("javascript:document.getElementsByClassName('ace_text-layer').value = '\"+Code+\"';");
    }
}
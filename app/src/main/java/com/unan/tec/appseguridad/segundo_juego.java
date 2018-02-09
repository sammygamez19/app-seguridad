package com.unan.tec.appseguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.View;
import android.widget.ImageButton;

public class segundo_juego extends AppCompatActivity {
    WebView webView;
    ImageButton act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_juego);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        act=(ImageButton)findViewById(R.id.sig);

        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),tercer_juego.class);
                startActivity(intent);


            }
        });

        webView = (WebView) findViewById(R.id.wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().getJavaScriptCanOpenWindowsAutomatically();
        webView.getSettings().supportMultipleWindows();
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setAppCacheMaxSize(5*1024*1024);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl("file:///android_asset/actividad.html");

    }
}

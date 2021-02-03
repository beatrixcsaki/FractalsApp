package com.example.fractals.fractalsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ViewMoreWebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_webview);

        WebView myWebView =  findViewById(R.id.webview);
        myWebView.loadUrl("http://slicker.me/fractals/animate.htm?fbclid=IwAR1rYfzTvQq4QVN9jkiqiIl1_d48SPu1gzKBYO_anTuHmV_EGJdhFvbuYlw");
    }
}

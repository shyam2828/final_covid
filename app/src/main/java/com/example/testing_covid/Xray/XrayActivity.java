package com.example.testing_covid.Xray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.example.testing_covid.Helpline.HelpLineActivity;
import com.example.testing_covid.MainActivity;
import com.example.testing_covid.R;

public class XrayActivity extends AppCompatActivity {

    ImageView back;

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xray);


        back=findViewById(R.id.back);

        web=findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://hospital-b2277.web.app/");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XrayActivity.this, MainActivity.class));
            }
        });
    }
}
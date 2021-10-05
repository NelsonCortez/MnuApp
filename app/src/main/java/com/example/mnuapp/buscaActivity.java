package com.example.mnuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class buscaActivity extends AppCompatActivity {
    TextView lcUrl;
    WebView lcWeb;
    Button lcBNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca);

        lcUrl = (TextView) findViewById(R.id.txtUrl);
        lcWeb = (WebView) findViewById(R.id.webNav);
        WebSettings webSettings = lcWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);

        lcBNav = (Button) findViewById(R.id.btnNav);
    }

    public void Navega(View view){
        String url = lcUrl.getText().toString();

        if(!url.isEmpty() ) {
            if( url.substring(0,4).toLowerCase() != "http" ){
                Toast.makeText(this, "Pagina: " +  url.substring(0,4).toLowerCase(), Toast.LENGTH_LONG).show();
                //url = "http://" + url ;

            }
            Toast.makeText(this, "Pagina: " +  url.trim(), Toast.LENGTH_LONG).show();
            lcWeb.loadUrl(url.trim());
            //lcWeb.loadUrl("https://umbvirtual.edu.co/");
        }
        else
        {
            Toast.makeText(this, "Pagina: dfault" ,Toast.LENGTH_LONG).show();
            lcWeb.loadUrl("https://umbvirtual.edu.co");
        }
    }

    public void NavInicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

}
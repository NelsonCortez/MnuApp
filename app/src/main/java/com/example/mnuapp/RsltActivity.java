package com.example.mnuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RsltActivity extends AppCompatActivity {
    private TextView vNom ;
    private TextView vApe ;
    private TextView vEda ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rslt);

        vNom = findViewById(R.id.vwNom);
        vApe = findViewById(R.id.vwApe);
        vEda = findViewById(R.id.vwEdad);
        vNom.setText("Nombres : " + getIntent().getStringExtra("NOM"));
        vApe.setText("Apellidos : " + getIntent().getStringExtra("APE"));
        vEda.setText("Edad : " + getIntent().getStringExtra("EDA"));

    }

    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    public void Salir(View view){
        this.finishAffinity();
    }

}


package com.example.mnuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegActivity extends AppCompatActivity {

    private EditText Nom;
    private EditText Ape;
    private EditText Eda;
    private TextView Err;
    private String lNom ;
    private String lApe ;
    private String lEda ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void Resultado(View view){
        Nom = findViewById(R.id.txtNom);
        Ape = findViewById(R.id.txtApe);
        Eda = findViewById(R.id.txtEdad);
        Err = findViewById(R.id.lblError);

        lNom = Nom.getText().toString().trim();
        lApe = Ape.getText().toString().trim();
        lEda = Eda.getText().toString().trim();

        if(!lNom.isEmpty() && !lApe.isEmpty()) {
            Intent resultado = new Intent(this, RsltActivity.class);

            resultado.putExtra("NOM", lNom);
            resultado.putExtra("APE", lApe);
            resultado.putExtra("EDA", lEda);
            startActivity(resultado);
        }
        else
        {
            // Si Nombre  y apellido está vacio
            Err.setText("Faltan datos en el registro.  Ingrese la totalidad de información e intente nuevamente");
        }
    }
}
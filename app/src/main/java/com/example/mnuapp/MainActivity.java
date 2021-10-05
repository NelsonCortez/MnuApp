package com.example.mnuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = (ListView) findViewById(R.id.lstMenu);
        //Cargar lista
        ArrayAdapter<CharSequence> miAdapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_expandable_list_item_1);
        lst.setAdapter(miAdapter);

        Toast.makeText(this,"Aplicacion con menu", Toast.LENGTH_LONG).show();

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcion = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(),"Selecciona: " + opcion, Toast.LENGTH_LONG ).show();
                switch (opcion) {
                    case "Institucional":
                        Institucional(view);
                        break;
                    case "Buscar":
                        Navegar(view);
                        break;
                    case "Registro":
                        Registro(view);
                        break;
                }
            }
        });

       // setContentView(R.layout.activity_menu);
        // Intent actMenu = new Intent(this, MenuActivity.class);
        //startActivity(actMenu);

    }

    public void Menu(View view) {
        Intent menu = new Intent(this, MenuActivity.class);
        startActivity(menu);
    }

    public void Institucional(View view) {
        Intent umb = new Intent(this, umbActivity.class);
        startActivity(umb);
    }

    public void Navegar(View view) {
        Intent navega = new Intent(this, buscaActivity.class);
        startActivity(navega);
    }

    public void Registro(View view) {
        Intent resultado = new Intent(this, RegActivity.class);
        startActivity(resultado);
    }

}
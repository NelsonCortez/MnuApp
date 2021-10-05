package com.example.mnuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity  {
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lst = (ListView) findViewById(R.id.lstMenu2);
/*        //Cargar lista
        ArrayAdapter<CharSequence> lst2Adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_expandable_list_item_1);
        lst.setAdapter(lst2Adapter);
*/

/*        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcion = parent.getItemAtPosition(position).toString();

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
*/

    }

    public void Institucional(View view) {
        Intent resultado = new Intent(this, RsltActivity.class);
        startActivity(resultado);
    }

    public void Navegar(View view) {
        Intent resultado = new Intent(this, RsltActivity.class);
        startActivity(resultado);
    }

    public void Registro(View view) {
        Intent resultado = new Intent(this, RegActivity.class);
        startActivity(resultado);
    }
}
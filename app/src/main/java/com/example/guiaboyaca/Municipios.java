package com.example.guiaboyaca;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.guiaboyaca.BasedeDatos.DbHelper;

public class Municipios extends AppCompatActivity {
    Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipios);

        btnRegistro = findViewById(R.id.btncrearbd);
        getSupportActionBar().hide();
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DbHelper dbHelper = new DbHelper(Municipios.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase(); //Crearla = Escribir
                // Validación
                if(db != null){
                    Toast.makeText(Municipios.this, "BASE DE DATOS CREADA",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(Municipios.this,"ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
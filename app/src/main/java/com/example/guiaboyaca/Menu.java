package com.example.guiaboyaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }



    public void onclicknobsa (View v){
        Intent cambiar =new Intent( this,Registro.class);
        startActivity(cambiar);
    }
    public void onclickuser (View v){
        Intent cambiar =new Intent( this,Registro.class);
        startActivity(cambiar);
    }

    public void onclickmongui(View view) {
        Intent cambiar =new Intent( this,Municipios.class);
        startActivity(cambiar);

    }
    public void opnobsa(View view) {
        Intent cambiar =new Intent( this,Municipios.class);
        startActivity(cambiar);

    }
}
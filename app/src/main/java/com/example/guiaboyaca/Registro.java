package com.example.guiaboyaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.guiaboyaca.BasedeDatos.Dbusuarios;
import com.google.android.material.textfield.TextInputEditText;

public class Registro extends AppCompatActivity {

EditText ingresanmbre,ingresapellido,ingrescorreo,ingrescontrasena;
Button btnRegistrarUser;
Dbusuarios DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ingresanmbre=findViewById(R.id.ingresanombre);
        ingresapellido=findViewById(R.id.ingresaapellido);
        ingrescorreo=findViewById(R.id.ingresacorreo);
        ingrescontrasena=findViewById(R.id.ingresacontrasena);
        btnRegistrarUser=findViewById(R.id.btnRegistrarUser);

        btnRegistrarUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=ingresanmbre.getText().toString();
                String apellido=ingresapellido.getText().toString();
                String correo=ingrescorreo.getText().toString();
                String contrasena=ingrescontrasena.getText().toString();

                if(TextUtils.isEmpty(nombre) && TextUtils.isEmpty(apellido) && TextUtils.isEmpty(correo) && TextUtils.isEmpty(contrasena)){
                    Toast.makeText(Registro.this,"Se requiere llenar los campos", Toast.LENGTH_SHORT).show();

                }
                else {
                    Boolean checknomusuario=DB.checknomusuario(correo);
                    if(checknomusuario ==false ){
                        Boolean insert =DB.insertarUsuario(nombre,apellido,correo,contrasena);

                        if (insert=true){
                            Toast.makeText(Registro.this,"Registro Exitoso", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(),Menu.class);
                            startActivity(intent);
                        }
                        else {Toast.makeText(Registro.this,"Registro Fallido", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(Registro.this,"Este correo ya fue registrado ", Toast.LENGTH_SHORT).show();
                    }


                }


            }
        });




    }




}
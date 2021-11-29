package com.example.guiaboyaca;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.guiaboyaca.BasedeDatos.DbUsuarios;


public class Registro extends AppCompatActivity {
    EditText username1, password1, repassword, correo;
    Button btnRegistro, volverSining; // Variable Global
    DbUsuarios DB;

    // Ciclo de vida de android = se ejecuta al iniciar nuestra activity onCreate, onStart, onResume.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        username1 = findViewById(R.id.username1);
        password1 = findViewById(R.id.password1);
        repassword = findViewById(R.id.repassword);
        correo = findViewById(R.id.correo);
        btnRegistro = findViewById(R.id.btnRegistro);
        volverSining = findViewById(R.id.volverSining);
        DB = new DbUsuarios(this);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username1.getText().toString(); //
                String pass = password1.getText().toString();
                String repass = repassword.getText().toString();
                String email = correo.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass) || TextUtils.isEmpty(email))
                    Toast.makeText(Registro.this, "Se requiere llenar los campos", Toast.LENGTH_SHORT).show();
                else{
                    if (pass.equals(repass)) {
                        Boolean checkuser = DB.checknomusuario(user);
                        if (checkuser == false) {
                            Boolean insert = DB.insertarUsuario(user, pass);
                            if (insert == true) {
                                Toast.makeText(Registro.this, "Registrado correctamente", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Menu.class);
                                startActivity(intent);

                            } else {
                                Toast.makeText(Registro.this, "Registro fallido", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(Registro.this, "El usuario ya existe", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Registro.this, "La contraseña no coincide", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

        volverSining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(getApplicationContext(),Menu.class);
                startActivity(intent);

            }
        });

    }
}
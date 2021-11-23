package com.example.guiaboyaca.BasedeDatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Dbusuarios extends DbHelper {

    Context context;


    // Constructor
    public Dbusuarios(@Nullable Context context) {
        super(context);
        this.context = context;
    }


    public Boolean insertarUsuario(String nombreusuario, String apellidousuario, String conrreousuario, String contrasenausuario) {

        DbHelper dbHelper = new DbHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nombreusuario", nombreusuario);
        values.put("apellidousuario", apellidousuario);
        values.put("correousuario", conrreousuario);
        values.put("contrasenausuario", contrasenausuario);
        long result = db.insert(TABLE_USERS, null, values);
        if (result == -1) {
            return false;
        } else {
            return true;
        }

    }

    public Boolean checknomusuario(String correoUsuario) {
        DbHelper dbHelper = new DbHelper((context));
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM usuarios WHERE correousuario=?", new String[]{correoUsuario});
        if (cursor.getCount() > 0)
            return true;
         else
            return false;

    }
    public Boolean checkcontrasena(String correoUsuario, String contrasenausuario) {
        DbHelper dbHelper = new DbHelper((context));
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM usuarios WHERE correousuario=?and contrasenausuario=?", new String[]{correoUsuario,contrasenausuario});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;

    }
}

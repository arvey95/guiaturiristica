package com.example.guiaboyaca.BasedeDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE = "dbguiaturistica.db";
    public static final String TABLE_USERS = "tusuarios";

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE_USERS + "("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreusuario TEXT NOT NULL,"+
                "apellidousuario TEXT NOT NULL,"+
                "correousuario TEXT NOT NULL,"+
                "contrasenausuario TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_USERS);// Consulta
        onCreate(sqLiteDatabase);

    }
}

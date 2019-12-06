package com.example.suzan.market.dbs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoHelper extends SQLiteOpenHelper {
    private static final String DATABASE = "dbmarket";
    private static final int VERSION = 1;



    public BancoHelper (Context context){
        super(context, DATABASE, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String cliente = "CREATE TABLE clientes(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nomecliente TEXT NOT NULL, cpf TEXT NOT NULL, endereco TEXT NOT NULL);";
        String produtos = "CREATE TABLE produtos(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nomeproduto TEXT NOT NULL, valorproduto TEXT NOT NULL);";
        String usuario = "CREATE TABLE usuario(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, login TEXT NOT NULL, senha TEXT NOT NULL);";
        String compras = "CREATE TABLE compras(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL);";
        db.execSQL(cliente);
        db.execSQL(produtos);
        db.execSQL(usuario);
        db.execSQL(compras);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String cliente = "DROP TABLE IF EXISTS clientes";
        String produtos = "DROP TABLE IF EXISTS produtos";
        String usuario = "DROP TABLE IF EXISTS usuario";
        String compras = "DROP TABLE IF EXISTS compras";
        db.execSQL(cliente);
        db.execSQL(produtos);
        db.execSQL(usuario);
        db.execSQL(compras);
    }


}

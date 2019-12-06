package com.example.suzan.market.dbs;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;



public class ComprasBd {

    private SQLiteDatabase db;
    public BancoHelper banco;

    public ComprasBd (Context context) {banco = new BancoHelper(context); }




}

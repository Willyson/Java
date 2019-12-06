package com.example.suzan.market.dbs;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.suzan.market.modelo.Produtos;

import java.util.ArrayList;


public class ProdutosBd {

    private SQLiteDatabase db;
    public BancoHelper banco;

    public ProdutosBd (Context context) {
        banco = new BancoHelper(context);
    }

    //aqui salva(inserir)
    public void SalvarProduto(Produtos produto) {
        ContentValues values = new ContentValues();

        values.put("nomeproduto", produto.getNomeProduto());
        values.put("valorproduto", produto.getValorProduto());

        banco.getWritableDatabase().insert("produtos",null,values);

    }

        // para alterar
    public void alterarProduto(Produtos produto){
        ContentValues values = new ContentValues();

        values.put("nomeproduto", produto.getNomeProduto());
        values.put("valorproduto", produto.getValorProduto());

        String [] args = {produto.getId().toString()};
        banco.getWritableDatabase().update("produtos", values,"id=?",args);

    }
    //EXCLUIR
    public void deletarProduto(Produtos produto){
        String [] args = {produto.getId().toString()};
        banco.getWritableDatabase().delete("produtos", "id=?",args);

    }


    //listar - mostrar(CONSULTAR)

    public ArrayList<Produtos> getLista() {
        String [] columns ={"id", "nomeproduto", "valorproduto"};
        Cursor cursor = banco.getWritableDatabase().query("produtos", columns, null, null, null, null, null, null);
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        while (cursor.moveToNext()) {
            Produtos produto = new Produtos();
            produto.setId(cursor.getLong(0));
            produto.setNomeProduto(cursor.getString(1));
            produto.setValorProduto(cursor.getString(2));

            produtos.add(produto);
        }

        return produtos;
    }



}

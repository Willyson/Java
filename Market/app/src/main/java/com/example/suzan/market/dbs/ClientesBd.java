package com.example.suzan.market.dbs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.suzan.market.modelo.Cliente;
import com.example.suzan.market.modelo.Usuario;

import java.util.ArrayList;

public class ClientesBd {

    private SQLiteDatabase db;
    public BancoHelper banco;

    public ClientesBd(Context context){
        banco = new BancoHelper(context);
    }

    //Salvar(inserir)
    public void SalvarCliente(Cliente cliente) {
        ContentValues values =  new ContentValues();

        values.put("nomecliente", cliente.getNomeCliente());
        values.put("cpf", cliente.getCpfCliente());
        values.put("endereco", cliente.getEnderecoCliente());


        banco.getWritableDatabase().insert("clientes", null, values);

    }
        //alterar
    public void alterarCliente(Cliente cliente){
        ContentValues values =  new ContentValues();

        values.put("nomecliente", cliente.getNomeCliente());
        values.put("cpf", cliente.getCpfCliente());
        values.put("endereco", cliente.getEnderecoCliente());



        String[] args = {cliente.getId().toString()};
        banco.getWritableDatabase().update("clientes", values, "id=?", args);

    }
        //excluir
    public void deletarCliente(Cliente cliente){
        String[] args = {cliente.getId().toString()};
        banco.getWritableDatabase().delete("clientes", "id=?", args);
    }


    //lista - mostrar

    public ArrayList<Cliente> getLista(){
        String [] columns = {"id", "nomecliente", "cpf", "endereco", "login", "senha"};
        Cursor cursor = banco.getWritableDatabase().query("clientes", columns, null,null,null, null, null,null);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        while (cursor.moveToNext()) {
            Cliente cliente= new Cliente();
            cliente.setId(cursor.getLong(0));
            cliente.setNomeCliente(cursor.getString(1));
            cliente.setCpfCliente(cursor.getString(2));
            cliente.setEnderecoCliente(cursor.getString(3));


            clientes.add(cliente);

        }

        return clientes;
    }




}

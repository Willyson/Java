package com.example.suzan.market.dbs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.suzan.market.modelo.Usuario;

import java.util.ArrayList;

public class UsuarioBd {

    private SQLiteDatabase db;
    public BancoHelper banco;

    public UsuarioBd (Context context) { banco = new BancoHelper(context); }

    //aqui salva(inserir)
    public void SalvarUsuario(Usuario usu) {
        ContentValues values =  new ContentValues();

        values.put("id", usu.getId());
        values.put("login", usu.getLoginUsu());
        values.put("senha", usu.getSenhaUsu());

        banco.getWritableDatabase().insert("usuario", null, values);

    }

    //alterar
    public void alterarUsuario(Usuario usu){
        ContentValues values =  new ContentValues();

        values.put("id", usu.getId());
        values.put("login", usu.getLoginUsu());
        values.put("senha", usu.getSenhaUsu());



        String[] args = {usu.getId().toString()};
        banco.getWritableDatabase().update("usuario", values, "id=?", args);

    }

    //excluir
    public void deletarUsuario(Usuario usu){
        String[] args = {usu.getId().toString()};
        banco.getWritableDatabase().delete("usuario", "id=?", args);
    }

    //lista - mostrar

    public ArrayList<Usuario> getListausu(){
        String [] columns = {"id", "login", "senha"};
        Cursor cursor = banco.getWritableDatabase().query("usuario", columns, null,null,null, null, null,null);
        ArrayList<Usuario> Usuario = new ArrayList<Usuario>();

        while (cursor.moveToNext()) {
            Usuario usu = new Usuario();
            usu.setId(cursor.getLong(0));
            usu.setLoginUsu(cursor.getString(1));
            usu.setSenhaUsu(cursor.getString(2));


            Usuario.add(usu);

        }

        return Usuario;
    }

    public Usuario validaUsuario(Usuario usu){
        Cursor cursor;
        String sql = "SELECT * FROM USUARIO WHERE login = ? AND senha = ?";
        String[] campos = {usu.getLoginUsu(), usu.getSenhaUsu()};
        cursor = banco.getWritableDatabase().rawQuery(sql,campos);
        Usuario us = new Usuario();

        if (cursor.moveToNext()){
            us.setId(cursor.getLong(cursor.getColumnIndex("id")));
            us.setLoginUsu(cursor.getString(cursor.getColumnIndex("login")));
            us.setSenhaUsu(cursor.getString(cursor.getColumnIndex("senha")));

            return us;
        }else {
            return usu;
        }

    }
}

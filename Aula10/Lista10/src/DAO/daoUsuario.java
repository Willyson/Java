/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DB;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William-Estudo
 */
public class daoUsuario {
    
    public DB db = new DB();
    public Usuario usuario = new Usuario();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String sql;
    
    public Usuario ValidaLogin(Usuario u) throws SQLException{
        
        if(!u.getNomeUsuario().isEmpty() && !u.getSenhaUsuario().isEmpty() && !u.getSenhaUsuario().contains("--")){
            
            sql = "SELECT NOME_USUARIO FROM USUARIO WHERE NOME_USUARIO = '" + u.getNomeUsuario() + "' AND  SENHA_USUARIO = '" + u.getSenhaUsuario() + "' AND STATUS_USUARIO = 'A'";
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            if(statement == null){
                usuario.setNomeUsuario("Usuario Invalido");
            }else{
                resultSet.next();
                usuario.setNomeUsuario(resultSet.getString(1));            
                return usuario;
            }
            
        }
        return null;
    }
    
}

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
import java.util.ArrayList;
import java.util.List;
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
    
    //Criar função de validação de E-mail e Senha 
    
    
    public boolean CadastraUsuario(Usuario u) throws SQLException{
        
        if(!u.getNomeUsuario().isEmpty() && !u.getSenhaUsuario().isEmpty() && !u.getSenhaUsuario().contains("--")){
            
            sql = "INSERT INTO USUARIO(NOME_USUARIO, SENHA_USUARIO, STATUS_USUARIO) VALUES ('"+u.getNomeUsuario()+"','"+u.getSenhaUsuario()+"','A')";
            statement = db.getConnection().prepareStatement(sql);
            statement.execute();
            
        }
        
        return true;
    }
    
    
    /* Retorna usuários cadastrados */
    
    public List<Usuario>  retornaUsuarios(){
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        
        
        
        try{
            sql = "SELECT ID_USUARIO,  NOME_USUARIO,   \"****\" SENHA_USUARIO,    STATUS_USUARIO FROM  USUARIO";
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Usuario usuario = new Usuario();
                
                usuario.setCodigoUsuario(resultSet.getInt(1));
                usuario.setNomeUsuario(resultSet.getString(2));
                usuario.setSenhaUsuario(resultSet.getString(3));
                usuario.setStatusUsuario(resultSet.getString(4));
                
                usuarios.add(usuario);
                
            }
            
//            for (Usuario usuario1 : usuarios) {
//                System.out.println(usuario1.toString());
//            }
            return usuarios;
            
        
        }catch(SQLException erro){
            System.out.println(erro);
        }
        
        
        
        return null;
    }
    
    
    /* Alterar senha */
    
    
    
}

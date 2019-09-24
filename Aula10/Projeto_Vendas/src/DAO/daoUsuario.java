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
     
    /**
     *
     * @param u
     * @return 
     * @throws SQLException
     */
    public Usuario ValidaLogin(Usuario u) throws SQLException{
        
        if(!u.getNomeUsuario().isEmpty() && !u.getSenhaUsuario().isEmpty() && !u.getSenhaUsuario().contains("--")){
            
            sql = "SELECT NOME_USUARIO FROM USUARIO WHERE NOME_USUARIO = '" + u.getNomeUsuario() + "' AND  SENHA_USUARIO = '" + u.getSenhaUsuario() + "' AND STATUS_USUARIO = 'A'";
            System.out.println(sql);
            try{
                statement = db.getConnection().prepareStatement(sql);
                resultSet = statement.executeQuery();
                resultSet.next();
                usuario.setNomeUsuario(resultSet.getString(1));            
                System.out.println("deu bom");
                return usuario;
                
            }catch(SQLException ex){
                if(ex.getErrorCode() == 0 )
                    usuario.setNomeUsuario("Usuario Invalido");
                return null;
//                
            }
//                
//          
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
    
    public ArrayList<Usuario>  retornaUsuarios(){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try{
            sql = "SELECT ID_USUARIO,	NOME_USUARIO, '****' SENHA_USUARIO,	CASE STATUS_USUARIO	WHEN 'A' THEN 'Ativo' ELSE 'Inativo' END AS STATUS FROM USUARIO";
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

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

   
    
    
    
    
    
}

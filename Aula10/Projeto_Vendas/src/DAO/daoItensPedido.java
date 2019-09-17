/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DB;
import Model.ItensPedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author William-Estudo
 */
public class daoItensPedido {
    
    public DB db;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
    
    
    public daoItensPedido(){
        db = new DB();
    }
    
    public String atualizar(int operacao, ItensPedido itenspedido){
        
        try{
            if(operacao == INCLUSAO){
                sql = "INSERT INTO ITENS_PED VALUES (? , ?, ?)";
                statement = db.getConnection().prepareStatement(sql);
                statement.setInt(1, itenspedido.getCodigoPedido());
                statement.setInt(2, itenspedido.getCodigoProduto());
                statement.setFloat(3, itenspedido.getQtdeItens());
                
            }else if(operacao == EXCLUSAO){
                sql = "";
                statement = db.getConnection().prepareStatement(sql);
                
            }
            
            if(statement.executeUpdate() == 0){
                men = "Falha na operacao";
            }
            
            
            
            
        }catch(SQLException erro){
            System.out.println(erro);
        }
        
        
        return men;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.DB;
import Model.Pedidos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author William-Estudo
 */
public class daoPedidos {
    
    public DB db;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
    
    public daoPedidos(){
        db = new DB();
    }
    
    public String atualizar(int operacao, Pedidos pedido){
        
        try{
            if(operacao == INCLUSAO){
                sql = "INSERT INTO PEDIDOS (CODCLI, DATA) VALUES (?, NOW())";
                statement = db.getConnection().prepareStatement(sql);
                statement.setInt(1, pedido.getCodigoCliente());
                
            }else if(operacao == EXCLUSAO){
                sql = "DELETE FROM PEDIDOS WHERE CODPED = ?";
                statement = db.getConnection().prepareStatement(sql);
                statement.setInt(1, pedido.getCodigoPedito());
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

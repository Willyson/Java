/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DB;
import Model.Produto;
import java.sql.*;

/**
 *
 * @author William-Estudo
 */
public class daoProduto {
    
    public Produto produto;
    public DB db;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    
    
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
    
    public daoProduto(){
        db = new DB();
        produto = new Produto();
    }
    
    public boolean localizaProduto(){
        sql = "SELECT DESCRICAO, PRECO, UNIDADE, QTDE_INICIAL, DATA_CAD, QTDE_ATUAL FROM PRODUTOS WHERE CODPROD = ?";
        
        try{
            statement = db.connection.prepareStatement(sql);
            statement.setInt(1, produto.getCodigoProduto());
            resultSet = statement.executeQuery();
            resultSet.next();
            
            produto.setDescProduto(resultSet.getString(1));
            produto.setPrecoProduto(resultSet.getFloat(2));
            produto.setUniProduto(resultSet.getString(3));
            produto.setQtdeInicialProduto(resultSet.getFloat(4));
            produto.setDataCadProduto(String.valueOf(resultSet.getDate(5)));
            produto.setQtdAtualProduto(resultSet.getFloat(6));
            return true;
            
        }catch(SQLException erro){
            return false;
        }
        
        
    }
    
    public String atualizar (int operacao){
        try{
            if(operacao == INCLUSAO){
                sql = "INSERT INTO PRODUTOS (DESCRICAO, PRECO, UNIDADE, QTDE_INICIAL, DATA_CAD, QTDE_ATUAL ) VALUES (?, ?, ?, ?, NOW(), ?)";
                statement = db.connection.prepareStatement(sql);
                
                statement.setString(1,(produto.getDescProduto()));
                statement.setFloat(2, (produto.getPrecoProduto()));
                statement.setString(3,(produto.getUniProduto()));
                statement.setFloat(4, (produto.getQtdeInicialProduto()));
                statement.setFloat(5, (produto.getQtdAtualProduto()));
            }
            else if (operacao == ALTERACAO){
                sql = "UPDATE PRODUTOS SET DESCRICAO = ?, PRECO = ?, UNIDADE = ?, QTDE_INICIAL = ?, DATA_CAD = NOW(), QTDE_ATUAL = ? WHERE CODPROD = ? ";
                statement = db.connection.prepareStatement(sql);
                
                statement.setString(1,(produto.getDescProduto()));
                statement.setFloat(2, (produto.getPrecoProduto()));
                statement.setString(3,(produto.getUniProduto()));
                statement.setFloat(4, (produto.getQtdeInicialProduto()));
                statement.setFloat(5, (produto.getQtdAtualProduto()));
            }
            else if(operacao == EXCLUSAO){
                sql = "DELETE FROM PRODUTOS WHERE CODPROD = ? ";
                statement = db.connection.prepareStatement(sql);
                statement.setInt(1, produto.getCodigoProduto());
            }
            
            if(statement.executeUpdate() == 0){
                men = "Falha na operacao";
            }
        }catch(SQLException erro){
            numero = erro.getErrorCode();
            if(numero == 1062)
                men = "Este código de produto já existe";
            else 
                men = "Falha na operação " + erro.toString();
        }
        return men;
    }
    
    
}

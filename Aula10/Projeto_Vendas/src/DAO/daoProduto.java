/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DB;
import Model.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        
    }
    
    public Produto localizaProduto(Produto produto){
        sql = "SELECT DESCRICAO, PRECO, QTDE, DATA_CAD FROM PRODUTO WHERE CODPROD = ?";
        
        try{
            statement = db.getConnection().prepareStatement(sql);
            statement.setInt(1, produto.getCodigoProduto());
            resultSet = statement.executeQuery();
            resultSet.next();
            
            produto.setDescProduto(resultSet.getString(1));
            produto.setPrecoProduto(resultSet.getFloat(2));
            produto.setQtde(resultSet.getFloat(3));
            produto.setDataCadProduto(String.valueOf(resultSet.getDate(4)));
            
            return produto;
            
        }catch(SQLException erro){
            return null;
        }
    }
    
    public boolean produtoDisponivel(int codigoProduto, float quantidade){
        
        sql = "SELECT QTDE FROM PRODUTO WHERE CODPROD = ?";
        
        try{
            statement = db.getConnection().prepareStatement(sql);
            statement.setInt(1, codigoProduto);
            resultSet = statement.executeQuery();
            resultSet.next();
            
            return resultSet.getFloat(1) >= quantidade;
            
            
        }catch(SQLException erro){
            System.out.println(erro);
            return false;
        }
      
    }
    
    
    /* Listar Produtos */
    
    public ArrayList<Produto> listarProdutos(){
        
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto;
        try{
            sql = "SELECT CODPROD, DESCRICAO, PRECO, QTDE, DATA_CAD AS DATA_CAD FROM PRODUTO";
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                
                produto = new Produto();
                
                produto.setCodigoProduto(resultSet.getInt(1));
                produto.setDescProduto(resultSet.getString(2));
                produto.setPrecoProduto(resultSet.getFloat(3));
                produto.setQtde(resultSet.getFloat(4));
                produto.setDataCadProduto(String.valueOf(resultSet.getString(5)));
                
                produtos.add(produto);
                
            }
        return produtos;
            
            
        }catch(SQLException erro){
            System.out.println(erro);
        }
        
        
        
        return null;
    }
    
    
    
    
    public String atualizar (int operacao, Produto produto){
        try{
            if(operacao == INCLUSAO){
                sql = "INSERT INTO PRODUTO VALUES (nextval('ID_PRODUTO'),?, ?, ?, CURRENT_DATE)";
                statement = db.getConnection().prepareStatement(sql);
                
                statement.setString(1,(produto.getDescProduto()));
                statement.setFloat(2, (produto.getPrecoProduto()));
                statement.setFloat(3,(produto.getQtde()));
               
            }
            else if (operacao == ALTERACAO){
                sql = "UPDATE PRODUTO SET DESCRICAO = ?, PRECO = ?, QTDE = ? WHERE CODPROD = ? ";
                statement = db.getConnection().prepareStatement(sql);
                
                statement.setString(1,(produto.getDescProduto()));
                statement.setFloat(2, (produto.getPrecoProduto()));
                statement.setFloat(3,(produto.getQtde()));
                statement.setInt(4, (produto.getCodigoProduto()));
            }
            else if(operacao == EXCLUSAO){
                sql = "DELETE FROM PRODUTOS WHERE CODPROD = ? ";
                statement = db.getConnection().prepareStatement(sql);
                statement.setInt(1, produto.getCodigoProduto());
            }
            
            if(statement.executeUpdate() == 0){
                men = "Falha na operacao";
                db.close();
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

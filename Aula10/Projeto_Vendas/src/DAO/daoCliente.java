/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William-Estudo
 */
public class daoCliente {
    public Cliente cliente;
    public DB db;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
    
    public daoCliente(){
        db = new DB();
        
    }
    
    
    /*
        Localizar aqui
    */
    
    
    public boolean localizarCliente(Cliente cliente){
        sql = "SELECT NOME, ENDER, BAIRRO, CIDADE, CEP, UF, EMAIL, FONE, CELULAR FROM CLIENTES WHERE CODCLI = ?";
        
        try{
            statement = db.connection.prepareStatement(sql);
            statement.setInt(1, cliente.getCodigoCliente());
            resultSet = statement.executeQuery();
            resultSet.next();
            
            cliente.setNomeCliente(resultSet.getString(1));
            cliente.setEnderecoCliente(resultSet.getString(2));
            cliente.setBairroCliente(resultSet.getString(3));
            cliente.setCidadeCliente(resultSet.getString(4));
            cliente.setCepCliente(resultSet.getString(5));
            cliente.setUfCliente(resultSet.getString(6));
            cliente.setEmailCliente(resultSet.getString(7));
            cliente.setFoneCliente(resultSet.getString(8));
            cliente.setCelularCliente(resultSet.getString(9));
            return true;
            
        }catch(SQLException erro){
            return false;
        }
        
    }
    
    /* ======== Listar Clientes ========== */
    
    public List<Cliente> ListarClientes(){
        
        List<Cliente> clientes = new ArrayList<>();
        
        try{
            sql = "SELECT * FROM CLIENTES";
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Cliente cliente = new Cliente();
                
                cliente.setCodigoCliente(resultSet.getInt(1));
                cliente.setNomeCliente(resultSet.getString(2));
                cliente.setEnderecoCliente(resultSet.getString(3));
                cliente.setBairroCliente(resultSet.getString(4));
                cliente.setCidadeCliente(resultSet.getString(5));
                cliente.setCepCliente(resultSet.getString(6));
                cliente.setUfCliente(resultSet.getString(7));
                cliente.setEmailCliente(resultSet.getString(8));
                cliente.setFoneCliente(resultSet.getString(9));
                cliente.setCelularCliente(resultSet.getString(10));
                
                clientes.add(cliente);
                
            }
            
            for (Cliente cliente1 : clientes) {
                System.out.println(cliente1.toString());
            }
            
            
            return clientes;
        }
        catch(SQLException erro){
            System.err.println(erro);
        }
        
        
        
        return null;
    }
    
    
    
    
    public int retornaIDCliente(String nomeCliente){
        
        sql = "SELECT CODCLI FROM CLIENTES WHERE NOME = '"+nomeCliente+"'";
        
        
        try{
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            resultSet.next();
            
            return resultSet.getInt(1);
            
        }catch(SQLException erro){
            return -1;
        }
        
        
    }
    
    
    
    public String atualizar(int operacao, Cliente cliente){
        
        men = "Operação realizada com sucesso";
        
        try{
            if(operacao == INCLUSAO){
                sql = "INSERT INTO CLIENTES (NOME, ENDER, BAIRRO, CIDADE, CEP, UF, EMAIL, FONE, CELULAR) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                statement = db.getConnection().prepareStatement(sql);
                
                statement.setString(1,(cliente.getNomeCliente()));
                statement.setString(2, (cliente.getEnderecoCliente()));
                statement.setString(3, (cliente.getBairroCliente()));
                statement.setString(4,(cliente.getCidadeCliente()));
                statement.setString(5, (cliente.getCepCliente()));
                statement.setString(6,(cliente.getUfCliente()));
                statement.setString(7,(cliente.getEmailCliente()));
                statement.setString(8, (cliente.getFoneCliente()));
                statement.setString(9, cliente.getCelularCliente());
            }
            else if (operacao == ALTERACAO){
                
                
                // Pega ID do cliente 
                
                    cliente.setCodigoCliente(retornaIDCliente(cliente.getNomeCliente()));
                
                //
                
                
                sql = "UPDATE CLIENTES SET NOME = ?, ENDER = ?, BAIRRO = ?, CIDADE = ?, CEP = ?, UF = ?, EMAIL = ?, FONE = ?, CELULAR = ? WHERE CODCLI = ? ";
                statement = db.connection.prepareStatement(sql);
                
                statement.setString(1,(cliente.getNomeCliente()));
                statement.setString(2, (cliente.getEnderecoCliente()));
                statement.setString(3, (cliente.getBairroCliente()));
                statement.setString(4,(cliente.getCidadeCliente()));
                statement.setString(5, (cliente.getCepCliente()));
                statement.setString(6,(cliente.getUfCliente()));
                statement.setString(7,(cliente.getEmailCliente()));
                statement.setString(8, (cliente.getFoneCliente()));
                statement.setString(9, cliente.getCelularCliente());
                statement.setInt(10, cliente.getCodigoCliente());
            }
            else if(operacao == EXCLUSAO){
                
                
                
                sql = "DELETE FROM CLIENTES WHERE CODCLI = ? ";
                statement = db.getConnection().prepareStatement(sql);
                statement.setInt(1, cliente.getCodigoCliente());
            }
            
            if(statement.executeUpdate() == 0){
                men = "Falha na operação";
            }
        }
        catch(SQLException erro){
            numero = erro.getErrorCode();
            if (numero == 1062)
                men = "Este código de cliente já existe";
            else 
                men = "Falha na operação " + erro.toString();
        }
        
        return men;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author William-Estudo
 */
public class DB {
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DBNAME = "VENDAS";
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "root";
    
    
    public boolean getConnection() throws SQLException{
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou");
            return true;
        }
        catch (ClassNotFoundException erro){
            System.out.println("Driver não encontrado " + erro.toString());
            return false;
        }
        catch (SQLException erro){
            System.out.println("Falha ao conectar " + erro.toString());
            return false;
        }
        
    }
    
    public void close(){
        try{
            connection.close();
            System.out.println("Desconectou");
        }
        catch (SQLException erro){
            System.out.println("Erro ao desconectar " + erro.toString());
        }
    }
}
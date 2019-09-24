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
    private final String DRIVER = "org.postgresql.Driver";
    private final String DBNAME = "vendas";
    private final String URL = "jdbc:postgresql://localhost:5432/" + DBNAME;
    private final String LOGIN = "postgres";
    private final String SENHA = "root";
    
    
    
    public java.sql.Connection getConnection() throws SQLException{
        Connection connection = null;
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            return connection;
        }
        catch (ClassNotFoundException erro){
            System.out.println("Driver não encontrado " + erro.toString());
            return null;
        }
        catch (SQLException erro){
            System.out.println("Falha ao conectar " + erro.toString());
            return null;
        }
        
    }
    
    public void close(){
        try{
            this.getConnection().close();
        }
        catch (SQLException erro){
            System.out.println("Erro ao desconectar " + erro.toString());
        }
    }

    public DB() {
    }
    
    
    
    
}
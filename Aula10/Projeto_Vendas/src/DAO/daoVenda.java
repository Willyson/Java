/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DB;
import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario.sp
 */
public class daoVenda {
    
    public DB db = new DB();
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    
    
    
    public ArrayList<Venda> retornaVendas(){
        
        
        
        try{
            sql="SELECT IP.CODPED, C.NOME, PR.DESCRICAO, TO_CHAR(ROUND(IP.QTDE * PR.PRECO, 2), 'R$9999.99') AS TOTAL\n" +
            "FROM PEDIDO P \n" +
            "INNER JOIN CLIENTE C ON (P.CODCLI = C.CODCLI)\n" +
            "INNER JOIN ITENS_PED IP ON (P.CODPED = IP.CODPED)\n" +
            "INNER JOIN PRODUTO PR ON (PR.CODPROD = IP.CODPROD)";
            
            statement = db.getConnection().prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            
            ArrayList<Venda> vendas = new ArrayList<>();
            
           
            
            while(resultSet.next()){
                Venda venda = new Venda();
                venda.setCodigoPedido(resultSet.getInt("CODPED"));
                venda.setNomeCliente(resultSet.getString("NOME"));
                venda.setProdutoVenda(resultSet.getString("DESCRICAO"));
                venda.setTotalVenda(resultSet.getString("TOTAL")); 
                vendas.add(venda);
                
            }
            return vendas;
            
        }catch(SQLException ex){
            return null;
        }
        
    }
    
    
}

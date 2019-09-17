/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import DAO.daoCliente;
import DAO.daoItensPedido;
import DAO.daoPedidos;
import DAO.daoProduto;
import DAO.daoUsuario;
import Model.Cliente;
import Model.ItensPedido;
import Model.Pedidos;
import Model.Produto;
import Model.Usuario;
import java.sql.SQLException;


/**
 *
 * @author William-Estudo
 */
public class ClasseTeste {
    public static void main(String[] args) throws SQLException {
        
        daoUsuario daoUser = new daoUsuario();
        
        /* Valida login */
        //Usuario u = new Usuario("adm", "1234");
        
        //JOptionPane.showMessageDialog(null, "Seja Bem-vindo " + daoUser.ValidaLogin(u).getNomeUsuario());
        
        
        /* Cadastra usuario */
     
       // Usuario novoUsuario = new Usuario("william", "1234");   
       // daoUser.CadastraUsuario(novoUsuario);
        
        
       /* Consultar usuários cadastrados */
        
        //daoUser.retornaUsuarios();
        
        
        
        
        /* Cadastra cliente */
        
        daoCliente daocliente = new daoCliente();
        
        Cliente novoCliente = new Cliente("William Cliente", "Endereco 1234", "Bairro Cliente", "Cidade Cliente", "04950140", "SP", "william@cliente.com", "58957739", "972012869");
        
        /* Insere Cliente */ 
        //daocliente.atualizar(1, novoCliente);
        
        
        /*Altera Cliente */
        
        //Cliente clienteAlterado = new Cliente("William Cliente", "Endereco 4321", "Cliente Bairro","Cliente Cidade", "048550140", "MG", "cliente@william.com", "77395895", "972019452");
        //daocliente.atualizar(2, clienteAlterado);
        
        
        /* Exclui Cliente */
        
        //Cliente removerCliente = new Cliente(1);
        //daocliente.atualizar(3, removerCliente);
        
        /* Consultar Clientes Cadastrados */
        
        //daocliente.ListarClientes();
        
        
        
        
        
        /*========== PRODUTO ========== */
        
        daoProduto daoproduto = new daoProduto();
        
        /* Cadastra Produto */
       
        //Produto novoProduto = new Produto("Produto novo", (float) 10.23,10);
        //daoproduto.atualizar(1, novoProduto);
        
        
        /* Atualiza Produto */
        
        //Produto alteraProduto = new Produto(1, "Produto alterado", (float) 23.10, 1);
        //daoproduto.atualizar(2, alteraProduto);
        
        
       /* Deleta Produto */
        
        //Produto removerProduto = new Produto(1);
        //daoproduto.atualizar(3, removerProduto);
        
        
       /* Listar Produtos */ 
        
        //daoproduto.listarProdutos();
        
        
       /* ======= PEDIDOS ========= */ 
        
       daoPedidos daopedidos = new daoPedidos();
       
       /* Cadastra pedido */
       
       //Pedidos novoPedido = new Pedidos(1); 
       //daopedidos.atualizar(1, novoPedido);
       
       /* Remove pedido */
       
       //Pedidos removePedido = new Pedidos(1,1);
       //daopedidos.atualizar(3, removePedido);
       
       
       /* ========== ITENS VENDIDOS ==========  */
       
        daoItensPedido daoitenspedido = new daoItensPedido();
       
       /* Cadastra itens vendidos */
       
        //ItensPedido itenspedido = new ItensPedido(2,2, 20);
        //daoitenspedido.atualizar(1, itenspedido);
        
       
        /* Realizar Venda */
        
        // Verificar se o cliente existe 
        
        Cliente clienteVenda = new Cliente();
        int codigoCliente = daocliente.retornaIDCliente("William Cliente");
        if(codigoCliente != -1){
            
            float quantidade = 10;
            int codigoProduto = 2;
            
            /* Verificar se há produto no estoque */
            if(daoproduto.produtoDisponivel(codigoProduto, quantidade)){
                
                Pedidos novoPedido = new Pedidos(codigoCliente);
                daopedidos.atualizar(1, novoPedido);
                
                
                ItensPedido item1 = new ItensPedido();
                
            }
            
            
        }
        else{
            System.out.println("Cliente não cadastrado ou nome errado");
        }
    }
}

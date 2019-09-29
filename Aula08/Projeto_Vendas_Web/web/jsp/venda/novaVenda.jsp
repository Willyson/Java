<%-- 
    Document   : novaVenda
    Created on : 24/09/2019, 20:18:58
    Author     : usuario.sp
--%>

<%@page import="Model.Venda"%>
<%@page import="DAO.daoVenda"%>
<%@page import="Model.Produto"%>
<%@page import="Model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.daoProduto"%>
<%@page import="DAO.daoCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    daoCliente daocliete = new daoCliente();
    daoProduto daoproduto = new daoProduto();
    daoVenda daovenda = new daoVenda();
    
    ArrayList<Cliente> clientes = daocliete.ListarClientes();
    ArrayList<Produto> produtos = daoproduto.listarProdutos();
    

    ArrayList<Venda> vendas = daovenda.retornaVendas();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css"/>
    </head>
    <body>
        
        <form method="POST" action='venda/salvarVenda.jsp' >
            
            <section class="sessaoVenda">
                <label for="cliente">Clientes</label>
                <select name="cliente" id="cliente">
                    <% for(int i = 0; i < clientes.size(); i++ ){ %>
                    <option value="<%= clientes.get(i).getCodigoCliente() %>"><%= clientes.get(i).getNomeCliente() %></option>
                    <% } %>
                </select>
            </section>
                
            <section class="sessaoVenda">
                <label>Produtos</label>
                <select name='produto'>
                    <% for(int i=0; i < produtos.size(); i++) { %>
                        <option value='<%= produtos.get(i).getCodigoProduto() %>' ><%= produtos.get(i).getDescProduto() %></option>
                    <% } %>
                </select>
                <input type="number" name="quantidade" id="quantidade" placeholder="Quantidade" class="inputPadrao" >
            </section>
                
                <input type="submit" value="Venda" class="botaoPadrao" /> 
        </form>
    </body>
    
</html>

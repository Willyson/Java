<%-- 
    Document   : listaVendas
    Created on : 29/09/2019, 11:28:55
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
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css"/>
        <title>JSP Page</title>
    </head>
    <script>
   $(document).ready(function(){
    
    $('.request_crud').click(function(event){
        event.preventDefault();
        var link = $(this).attr('href');
        $('.action_request').load(link);
        $('.box_rq').fadeIn();
    });            
});
    </script>
    
    
    <body>
        <a href="venda/novaVenda.jsp" class="request_crud botaoPadrao" >Nova Venda</a>
        <table class="tablePadrao" >
                <thead><tr><td>Pedido</td><td>Cliente</td><td>Produto</td><td>Total</td></tr></thead>
                <tbody>
                    <% for(int i=0; i < vendas.size(); i++) { %>
                    <tr>
                        <td><%= vendas.get(i).getCodigoPedido() %></td>
                        <td><%= vendas.get(i).getNomeCliente() %></td>
                        <td><%= vendas.get(i).getProdutoVenda() %></td>
                        <td><%= vendas.get(i).getTotalVenda() %></td>
                    </tr>
                    <% } %>
                    
                </tbody>
            </table>
    </body>
    
    
</html>

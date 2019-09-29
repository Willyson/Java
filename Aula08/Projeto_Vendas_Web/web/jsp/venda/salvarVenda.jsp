<%-- 
    Document   : salvarVenda
    Created on : 25/09/2019, 18:42:00
    Author     : usuario.sp
--%>

<%@page import="Model.ItensPedido"%>
<%@page import="DAO.daoItensPedido"%>
<%@page import="Model.Pedidos"%>
<%@page import="DAO.daoProduto"%>
<%@page import="Model.Produto"%>
<%@page import="DAO.daoPedidos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    int codigoCliente = Integer.parseInt(request.getParameter("cliente"));
    int codigoProduto = Integer.parseInt(request.getParameter("produto"));
    float quantidade = Float.parseFloat(request.getParameter("quantidade"));
    
    
    //Novo Pedido 
    daoPedidos daopedido = new daoPedidos();
    daoProduto daoproduto = new daoProduto();
    Pedidos novopedido = new Pedidos(codigoCliente);
    
    
    Produto produtos = new Produto(codigoProduto);
    
    
    if (daoproduto.produtoDisponivel(codigoProduto, quantidade)){
        daopedido.atualizar(1, novopedido);
        
        daoItensPedido daoitempedido = new daoItensPedido();
        ItensPedido itensPedido = new ItensPedido((daopedido.retornaUltimoPedido(codigoCliente)), codigoProduto, quantidade);
        
        daoitempedido.atualizar(1, itensPedido);
        
        produtos = daoproduto.localizaProduto(produtos);
        
        produtos.setQtde(produtos.getQtde() - quantidade);
        
        daoproduto.atualizar(2, produtos);
        
        response.sendRedirect("../entradaSistema.jsp");
        
    }else{
        
    }
    

%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>

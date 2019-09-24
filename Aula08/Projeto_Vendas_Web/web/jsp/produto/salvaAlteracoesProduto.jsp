<%-- 
    Document   : salvaAlteracoesProduto
    Created on : 23/09/2019, 19:04:00
    Author     : usuario.sp
--%>

<%@page import="Model.Produto"%>
<%@page import="DAO.daoProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    String descProduto = request.getParameter("descProduto");
    float precoProduto = Float.parseFloat(request.getParameter("precoProduto"));
    float qtde = Float.parseFloat(request.getParameter("qtdeProduto"));
    String dataCadastro = request.getParameter("dataCadastro");
    int codigoProduto = Integer.parseInt(request.getParameter("CodigoProduto"));

    daoProduto daoproduto = new daoProduto();
    Produto p = new Produto(codigoProduto, descProduto, precoProduto, qtde);
    
    daoproduto.atualizar(2, p);
    
    response.sendRedirect("listaProdutos.jsp");
    
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    </body>
</html>

<%-- 
    Document   : salvaNovoProduto
    Created on : 23/09/2019, 20:33:00
    Author     : usuario.sp
--%>

<%@page import="DAO.daoProduto"%>
<%@page import="Model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    String descProduto = request.getParameter("descProduto");
    float precoProduto = Float.parseFloat(request.getParameter("precoProduto"));
    float qtdeProduto = Float.parseFloat(request.getParameter("qtdeProduto"));
    
    Produto novoProduto = new Produto(descProduto, precoProduto, qtdeProduto);
    
    daoProduto daoproduto = new daoProduto();
    
    daoproduto.atualizar(1, novoProduto);
    
    //response.sendRedirect("entradaSistema.jsp");

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= novoProduto.toString() %></h1>
    </body>
</html>

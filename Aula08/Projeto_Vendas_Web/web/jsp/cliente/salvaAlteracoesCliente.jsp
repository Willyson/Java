<%-- 
    Document   : salvaAlteracoes
    Created on : 21/09/2019, 23:19:51
    Author     : usuario.sp
--%>

<%@page import="Model.Cliente"%>
<%@page import="DAO.daoCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    String nomeCliente = request.getParameter("nomeCliente");
    String enderecoCliente = request.getParameter("enderecoCliente");
    String bairroCliente = request.getParameter("bairroCliente");
    String cidadeCliente = request.getParameter("cidadeCliente");
    String cepCliente = request.getParameter("cepCliente");
    String ufCliente = request.getParameter("ufCliente");
    String emailCliente = request.getParameter("emailCliente");
    String foneCliente = request.getParameter("foneCliente");
    String celularCliente = request.getParameter("celularCliente");
    
    Cliente cliente = new Cliente(nomeCliente, enderecoCliente, bairroCliente, cidadeCliente, cepCliente, ufCliente, emailCliente, foneCliente, celularCliente);
    
    cliente.setCodigoCliente(Integer.parseInt(request.getParameter("CodigoCliente")));
    
    daoCliente daocliente = new daoCliente();

    daocliente.atualizar(2, cliente);
    
    response.sendRedirect("listaClientes.jsp");

%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salvando Alterações...</title>
    </head>
    <body>
    </body>
</html>

<%-- 
    Document   : salvaNovoCliente
    Created on : 22/09/2019, 13:43:38
    Author     : usuario.sp
--%>

<%@page import="DAO.daoCliente"%>
<%@page import="Model.Cliente"%>
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
    
    
    Cliente novoCliente = new Cliente(nomeCliente, enderecoCliente, bairroCliente, cidadeCliente, cepCliente, ufCliente, emailCliente, foneCliente, celularCliente);

    daoCliente daocliente = new daoCliente();
    
    daocliente.atualizar(1, novoCliente);
    
    response.sendRedirect("../entradaSistema.jsp?login_status=true?janela=2");

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

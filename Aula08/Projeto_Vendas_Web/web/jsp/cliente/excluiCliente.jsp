<%-- 
    Document   : excluiCliente
    Created on : 21/09/2019, 23:57:01
    Author     : usuario.sp
--%>

<%@page import="DAO.daoCliente"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

    Cliente clienteExclusao = new Cliente(Integer.parseInt(request.getParameter("CodigoCliente")));
    daoCliente exclui = new daoCliente();
    
    exclui.atualizar(3, clienteExclusao);
    response.sendRedirect("listaClientes.jsp");
    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>

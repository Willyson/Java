<%-- 
    Document   : alteraCliente
    Created on : 21/09/2019, 18:05:39
    Author     : usuario.sp
--%>

<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="DAO.daoCliente" %>
<% 
    
    daoCliente daocliente = new daoCliente();
    Cliente clienteUrl = new Cliente(Integer.parseInt(request.getParameter("CodigoCliente")));
    Cliente clienteAltera = daocliente.localizarCliente(clienteUrl);
    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="salvaAlteracoesCliente.jsp?CodigoCliente=<%= request.getParameter("CodigoCliente")%>" method="POST">
            <input type="text" placeholder="Nome do Cliente" value="<%= clienteAltera.getNomeCliente() %>" name="nomeCliente"/>
            <input type="text" placeholder="CEP" value="<%= clienteAltera.getCepCliente() %>" name="cepCliente"/>
            <input type="text" placeholder="Endereço do Cliente" value="<%= clienteAltera.getEnderecoCliente() %>" name="enderecoCliente" />
            <input type="text" placeholder="Bairro do Cliente" value="<%= clienteAltera.getBairroCliente() %>" name="bairroCliente" />
            <input type="text" placeholder="Cidade do Cliente" value="<%= clienteAltera.getCidadeCliente() %>" name="cidadeCliente" />
            <input type="text" placeholder="UF" value="<%= clienteAltera.getUfCliente() %>" name="ufCliente" />
            <input type="email" placeholder="email" value="<%= clienteAltera.getEmailCliente() %>" name="emailCliente" />
            <input type="text" placeholder="Telefone" value="<%= clienteAltera.getFoneCliente() %>" name="foneCliente" />
            <input type="text" placeholder="Celular" value="<%= clienteAltera.getCelularCliente() %>" name="celularCliente" />
            <input type="submit" value="Salvar"/>
            <input type="button" value="Voltar" id="btnVolta" onclick="voltaPagina()"/>
        </form>
    </body>
    
    <script src="../../js/cliente/acoesBasicasCliente.js"></script>
</html>

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
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <form action="salvaAlteracoesCliente.jsp?CodigoCliente=<%= request.getParameter("CodigoCliente")%>" method="POST">
            <input type="text" placeholder="Nome do Cliente" value="<%= clienteAltera.getNomeCliente() %>" name="nomeCliente" class="inputPadrao"/>
            <input type="text" placeholder="CEP" value="<%= clienteAltera.getCepCliente() %>" name="cepCliente" class="inputPadrao" />
            <input type="text" placeholder="Endereço do Cliente" value="<%= clienteAltera.getEnderecoCliente() %>" name="enderecoCliente" class="inputPadrao" />
            <input type="text" placeholder="Bairro do Cliente" value="<%= clienteAltera.getBairroCliente() %>" name="bairroCliente" class="inputPadrao" />
            <input type="text" placeholder="Cidade do Cliente" value="<%= clienteAltera.getCidadeCliente() %>" name="cidadeCliente" class="inputPadrao" />
            <input type="text" placeholder="UF" value="<%= clienteAltera.getUfCliente() %>" name="ufCliente" class="inputPadrao" />
            <input type="email" placeholder="email" value="<%= clienteAltera.getEmailCliente() %>" name="emailCliente" class="inputPadrao" />
            <input type="text" placeholder="Telefone" value="<%= clienteAltera.getFoneCliente() %>" name="foneCliente" class="inputPadrao" />
            <input type="text" placeholder="Celular" value="<%= clienteAltera.getCelularCliente() %>" name="celularCliente" class="inputPadrao" />
            <input type="submit" value="Salvar" class="botaoPadrao" />
        </form>
    </body>
    
    <script src="../../js/cliente/acoesBasicasCliente.js"></script>
</html>

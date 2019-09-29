<%-- 
    Document   : alterarUsuario
    Created on : 24/09/2019, 12:56:01
    Author     : usuario.sp
--%>

<%@page import="Model.Usuario"%>
<%@page import="DAO.daoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Usuario usuario = new Usuario();
    usuario.setCodigoUsuario(Integer.parseInt(request.getParameter("codigoUsuario")));
    
    daoUsuario daousuario = new daoUsuario();
    
    usuario = daousuario.retornaUsuario(usuario);
    

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css"/>
    </head>
    <body>
        <form action="salvaAlteracoesUsuario.jsp?codigoUsuario=<%= usuario.getCodigoUsuario() %>" method="POST">
            <input type="text" value="<%= usuario.getNomeUsuario() %>" name="nomeUsuario" class="inputPadrao" placeholder="Usuário" required />
            <input type="text" value="<%= usuario.getSenhaUsuario() %>" name="senhaUsuario" class="inputPadrao"  placeholder="Senha" required/>
            <input type="text" value="<%= usuario.getStatusUsuario() %>" name="statusUsuario" class="inputPadrao" />
            <input type="submit" value="Salvar"  class="botaoPadrao" />
        </form>
    </body>
</html>

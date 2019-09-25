<%-- 
    Document   : listaUsuarios
    Created on : 22/09/2019, 15:30:54
    Author     : usuario.sp
--%>

<%@page import="Model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.daoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    daoUsuario daousuario = new daoUsuario();
    
    ArrayList<Usuario> usuarios = daousuario.retornaUsuarios();
    int qtdUsuarios = usuarios.size();
    

%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr><td>Código do Usuário</td><td>Nome de Usuário</td><td>Senha do Usuário</td><td>Status</td><td>Ações</td></tr>
            </thead>
            <tbody>
                <% for(int i = 0; i < qtdUsuarios; i++){ %>
                <tr>
                    <td><%= usuarios.get(i).getCodigoUsuario() %></td>
                    <td><%= usuarios.get(i).getNomeUsuario() %></td>
                    <td><%= usuarios.get(i).getSenhaUsuario() %></td>
                    <td><%= usuarios.get(i).getStatusUsuario() %></td>
                    <td><a href="usuario/alterarUsuario.jsp?codigoUsuario=<%= usuarios.get(i).getCodigoUsuario() %>">Editar</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>

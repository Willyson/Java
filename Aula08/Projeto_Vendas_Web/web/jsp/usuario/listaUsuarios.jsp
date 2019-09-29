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
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css"/>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <title>JSP Page</title>
    </head>
    <script>
        $(document).ready(function(){
            
            $('.request_crud').click(function(event){
               event.preventDefault();
               var link = $(this).attr('href');
               $('.action_request').load(link);
               $('.box_rq').fadeIn();
            });
            
        });
        
    </script>
    
    
    <body class="body">
        <table class="tablePadrao">
            <thead>
                <tr><td>Código</td><td>Usuário</td><td>Senha</td><td>Status</td><td>Ações</td></tr>
            </thead>
            <tbody>
                <% for(int i = 0; i < qtdUsuarios; i++){ %>
                <tr>
                    <td><%= usuarios.get(i).getCodigoUsuario() %></td>
                    <td><%= usuarios.get(i).getNomeUsuario() %></td>
                    <td><%= usuarios.get(i).getSenhaUsuario() %></td>
                    <td><%= usuarios.get(i).getStatusUsuario() %></td>
                    <td><a href="usuario/alterarUsuario.jsp?codigoUsuario=<%= usuarios.get(i).getCodigoUsuario() %>" class="request_crud" >Editar</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>

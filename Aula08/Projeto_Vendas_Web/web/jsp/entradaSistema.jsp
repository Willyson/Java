<%-- 
    Document   : login
    Created on : 19/09/2019, 13:14:01
    Author     : usuario.sp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Usuario" %>
<%@page import="DAO.daoUsuario" %>

<%
    
    String usuario_login = (String) session.getAttribute("usuario_login");
    String senha_login  = (String) session.getAttribute("senha_login");

    if(!usuario_login.isEmpty()){
        daoUsuario valida_usuario = new daoUsuario();
        Usuario usuario_deslogado = new Usuario(request.getParameter("nomeUsuario"), request.getParameter("senhaUsuario"));
        //if(valida_usuario.ValidaLogin(usuario_deslogado) == null ){
        //    response.sendRedirect("../index.jsp?error=01");
        //}
    } 
    
%>

<!DOCYTPE HTML>
<html>
    <head>
        
        <title>Sistema de Controle de Vendas</title>
        
        
        
        
    </head>
    <body>

        <%@include file="menu.jsp" %>
        

    </body>
    <script src="../js/chamadaPagina.js"></script>
</html>




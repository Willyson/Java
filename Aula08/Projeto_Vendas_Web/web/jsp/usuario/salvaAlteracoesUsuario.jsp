<%-- 
    Document   : salvaAlteracoesUsuario
    Created on : 24/09/2019, 19:17:22
    Author     : usuario.sp
--%>

<%@page import="DAO.daoUsuario"%>
<%@page import="Model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    String nomeUsuario = request.getParameter("nomeUsuario");
    String senhaUsuario = request.getParameter("senhaUsuario");
    String statusUsuario = request.getParameter("statusUsuario");
    int codigoUsuario = Integer.parseInt(request.getParameter("codigoUsuario"));
    
    Usuario usuarioAtualizado = new Usuario(codigoUsuario, nomeUsuario, senhaUsuario, statusUsuario);

    daoUsuario daousuario = new daoUsuario();
    
    daousuario.atualizaUsuario(usuarioAtualizado);
    
    response.sendRedirect("listaUsuarios.jsp");
%>

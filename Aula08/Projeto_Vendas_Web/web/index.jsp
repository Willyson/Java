<%-- 
    Document   : index
    Created on : 19/09/2019, 13:15:32
    Author     : usuario.sp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Login Usuario</title>
        <link rel="stylesheet" type="text/css" href="css/estiloPadrao.css"/>
        <link rel="stylesheet" type="text/css" href="css/modal.css" />
        <meta charset="utf-8"/>
    </head>
    <body>

        <!--Login no sistema-->

        <form action="index.jsp" method="POST" class="formulario">
            <p class="tituloForm">Sistema de Controle de Vendas</p>
            <input type="text" name="nomeUsuario" placeholder="Digite seu usuário" required/>
            <input type="password" name="senhaUsuario" placeholder="Senha " required/>
            <a href="recuperaSenha.html">Esqueci minha senha</a>
            <input type="submit" value="Entrar"/>
        </form>

        <%
            String usuario = request.getParameter("nomeUsuario");
            String senha = request.getParameter("senhaUsuario");
            
            if(usuario != null && senha != null && !usuario.isEmpty() && !senha.isEmpty() ){
                session.setAttribute("usuario_login", usuario);
                session.setAttribute("senha_usuario", senha);
                
                response.sendRedirect("jsp/entradaSistema.jsp");
                
            }
            try{
            if((String) session.getAttribute("usuario_login") != null){
                response.sendRedirect("jsp/entradaSistema.jsp");
            }
            } catch (Exception e){
                String teste;
            }
            
        %>

        <!-- Cadastro do usuário -->


        


    </body>

</html>

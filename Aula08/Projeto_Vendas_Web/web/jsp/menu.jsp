<%-- 
    Document   : menu
    Created on : 22/09/2019, 14:58:14
    Author     : usuario.sp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/menu.css" />
        <script>
            $(document).ready(function(){
                
                var janela_open = '<% out.print(request.getParameter("janela")); %>';
                
                if(janela_open != ""){
                    var janela_loader = $('#'+janela_open).attr('href');
                }
                
                //loader dos conteudos dos menus
                $('.padraoLinks').click(function(event){
                    event.preventDefault();
                    var link_menu = $(this).attr('href');
                    
                    $('.content_request').load(link_menu);
                    
                });
                //fecha light box
                $('.light_box').click(function(){
                    $('.light_box').fadeOut();
                    $('.action_request').fadeOut();
                    
                });
                           
                
                
                
                
            });
            
        </script>
    </head>
    <body>
        <nav class="menu">
            <ul>
                <li><a  class="venda padraoLinks" ></a></li>
                <li><a href="usuario/listaUsuarios.jsp" class="usuario padraoLinks" id="1"></a></li>
                <li><a href="cliente/listaClientes.jsp" class="cliente padraoLinks" id="2"></a></li>
                <li><a href="Produto/listaProdutos.jsp" class="produto padraoLinks" id="3"></a></li>
            </ul>
        </nav>
        
        
        <div class="content_request">
        </div>
        
        <div class="light_box box_rq">
        </div>
        <div class="action_request box_rq"></div>
        
        <a href="logoff.jsp">Logoff</a>

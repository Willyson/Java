<%-- 
    Document   : editarProduto
    Created on : 23/09/2019, 18:40:28
    Author     : usuario.sp
--%>

<%@page import="javax.swing.text.html.HTML"%>
<%@page import="Model.Produto"%>
<%@page import="DAO.daoProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    daoProduto daoproduto = new daoProduto();
    Produto produtoAEditar = new Produto(Integer.parseInt(request.getParameter("codigoProduto")));
    
    produtoAEditar = daoproduto.localizaProduto(produtoAEditar);

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../../css/usuario/estiloUsuario.css"/>
    </head>
    <body>
        <form action="salvaAlteracoesProduto.jsp?CodigoProduto=<%= produtoAEditar.getCodigoProduto() %>" method="POST">
            <input type="text" name="descProduto" id="descProduto" value="<%= produtoAEditar.getDescProduto() %>" class="inputPadrao" />
            <input type="text" name="precoProduto" value="<%= produtoAEditar.getPrecoProduto() %>"  class="inputPadrao" />
            <input type="text" name="qtdeProduto" value="<%= produtoAEditar.getQtde() %>" class="inputPadrao" />
            <input type="text" name="dataCadastro" value="<%= produtoAEditar.getDataCadProduto() %>" class="inputPadrao" />
            <input type="submit" value="Salvar" id="btnSalvar"  class="botaoPadrao"/>
        </form>
            
    </body>
</html>

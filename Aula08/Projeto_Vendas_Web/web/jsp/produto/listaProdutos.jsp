
<%@page import="Model.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.daoProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
    daoProduto daoproduto = new daoProduto();
    
    ArrayList<Produto> produtos = daoproduto.listarProdutos();
    
    int qtdProdutos = produtos.size();

%>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/modal.css"/>
        <link rel="stylesheet" href="../css/usuario/estiloUsuario.css" />   
        <title>JSP Page</title>
    </head>
    <body>
        
        <input type="text" placeholder="Nome do Produto" class="inputPadrao" /> 
        <input type="button" value="Novo Produto" id="btnNovoProduto" class="botaoPadrao"/>
        
        <table class="tablePadrao">
            <thead>
                <tr>
                    <td>Código</td>
                    <td>Produto</td>
                    <td>Preço</td>
                    <td>Quantidade disponível</td>
                    <td colspan="2">Ações</td>
                </tr>
            </thead>
        <tbody>
            <% for(int i = 0; i < qtdProdutos; i++){ %>
            <tr>
                <td><%= produtos.get(i).getCodigoProduto() %></td>
                <td><%= produtos.get(i).getDescProduto() %></td>
                <td>R$<%= produtos.get(i).getPrecoProduto()  %></td>
                <td><%= produtos.get(i).getQtde() %></td>
                <td><a href="Produto/editarProduto.jsp?codigoProduto=<%= produtos.get(i).getCodigoProduto() %>">Editar</a></td>
                <td><a href="#">Excluir</a></td>
            </tr>
            <% } %>
          </tbody>
        </table>
        
        <form method="POST" action="Produto/salvaNovoProduto.jsp" > 
            <div class="modal" id="modalCadastroCliente">
                <a href="#" rel="modal:close">Fechar</a>
                <input type="text" name="descProduto" placeholder="Descrição do Produto" class="inputPadrao" />
                <input type="text" name="precoProduto" placeholder="Preço" class="inputPadrao" />
                <input type="text" name="qtdeProduto" placeholder="Quantidade" class="inputPadrao" />
                <input type="submit" value="Salvar" class="botaoPadrao" />
            </div>
        </form>
        
    </body>
    
</html>

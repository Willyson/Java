
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
        <title>JSP Page</title>
    </head>
    <body>
        
        <input type="text" placeholder="Nome do Produto"/> <input type="button" value="Novo Produto" id="btnNovoProduto">
        
        <table border="1">
            <thead><td>Código do Produto</td><td>Produto</td><td>Preço</td><td>Quantidade disponível</td><td colspan="2">Ações</td></thead>
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
        
        <form id="modalCadastroProduto" method="POST" action="Produto/salvaNovoProduto.jsp" > 
            <div class="modal-content">
                <span class="close">&times;</span>
                <input type="text" name="descProduto" placeholder="Descrição do Produto">
                <input type="text" name="precoProduto" placeholder="Preço" />
                <input type="text" name="qtdeProduto" placeholder="Quantidade" />
                <input type="submit" value="Salvar">
            </div>
            
        </form>
        
    </body>
    
    
    <script>
        
        var modal = document.getElementsByClassName("modal");
        
        document.getElementById("btnNovoProduto").addEventListener("click", function(){
            modal.style.display = "block";
        });
        
        
    </script>
    
    
    
    
    
</html>

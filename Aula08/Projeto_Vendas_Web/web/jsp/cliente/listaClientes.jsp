<%-- 
    Document   : cadastraCliente
    Created on : 21/09/2019, 10:05:26
    Author     : usuario.sp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.daoCliente" %>


<%
    
    daoCliente daocliente = new daoCliente();
    ArrayList<Cliente> clientes = daocliente.ListarClientes();
    int qtdClientes = clientes.size();

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <link rel="stylesheet" href="../css/modal.css"/>
        <title>Clientes</title>
        <script>
            $(document).ready(function(){
                //requisição de crud
                $('.request_crud').click(function(eventReq){
                    eventReq.preventDefault();
                    var link_crud = $(this).attr('href');
                    
                    $('.action_request').load(link_crud);
                    $('.box_rq').fadeIn();
                });
            });
        </script>
        
    </head>
    <body>
        
        <!--Localiza o cliente -->
        <input type="text" name="pesquisaNomeCliente" placeholder="Digite o nome do cliente">
        <input type="button" value="Novo Cliente" id="btnNovoCliente" />
        <input type="button" value="Voltar" onclick="voltaPagina()">
    
        <table border="1">
            <thead>
                <tr><td>Código</td><td>Nome</td><td>Telefone</td><td>Celular</td><td>E-mail</td><td colspan="2">Ações</td></tr>
            </thead>
            <tbody>
               <% for(int i = 0; i < qtdClientes; i++){ %>
                    <tr>
                        <td><%= clientes.get(i).getCodigoCliente() %></td>
                        <td><%= clientes.get(i).getNomeCliente() %></td>
                        <td><%= clientes.get(i).getFoneCliente() %></td>
                        <td><%= clientes.get(i).getCelularCliente() %></td>
                        <td><%= clientes.get(i).getEmailCliente() %></td>
                        <td><a class="request_crud" href="../jsp/cliente/alteraCliente.jsp?CodigoCliente=<%= clientes.get(i).getCodigoCliente() %>">Alterar</a></td>
                        <td><a class="request_crud" href="../jsp/cliente/excluiCliente.jsp?CodigoCliente=<%= clientes.get(i).getCodigoCliente() %>">Excluir</a></td>
                    </tr>
                <% } %>       
        </tbody>
        </table>
        
        <form action="../jsp/cliente/salvaNovoCliente.jsp" method="POST" >
            <div id="modalCadastroCliente" class="modal">
                <div class="modal-content">
                    <span class="close">&times;</span>
                    <input type="text" name="nomeCliente" placeholder="Digite o novo nome do cliente"/>
                    <input type="text" name="cepCliente" placeholder="Digite o CEP do Cliente"/>
                    <input type="text" placeholder="Endereço do Cliente" name="enderecoCliente" />
                    <input type="text" placeholder="Bairro do Cliente" name="bairroCliente" />
                    <input type="text" placeholder="Cidade do Cliente" name="cidadeCliente" />
                    <input type="text" placeholder="UF" name="ufCliente" />
                    <input type="email" placeholder="email" name="emailCliente" />
                    <input type="text" placeholder="Telefone" name="foneCliente" />
                    <input type="text" placeholder="Celular"  name="celularCliente" />    
                    <input type="submit" name="btnCadastraCliente" value="Cadastrar"> 
                </div>
            </div>
        </form>
        <script src="../js/modal.js"></script>
        <script src="../js/cliente/acoesBasicasCliente.js"></script>
    </body>
</html>


<%-- 
    Document   : conexao
    Created on : 20/09/2019, 15:44:54
    Author     : usuario.sp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>


<%

    ResultSet rs;
    String sql = "INSERT INTO TESTE VALUES (4, 'DESC4')";
    Class.forName("org.postgresql.Driver");
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_teste","postgres","root");
    
    PreparedStatement stmt = connection.prepareStatement(sql);
    
    stmt.executeUpdate();

%>



<%= connection.toString() %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>

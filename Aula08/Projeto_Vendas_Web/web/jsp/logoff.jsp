<%-- 
    Document   : logoff
    Created on : 23/09/2019, 18:06:47
    Author     : usuario.sp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           
            session.invalidate();
            
            response.sendRedirect("../index.jsp");
            
         %>
    </body>
</html>

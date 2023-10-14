<%-- 
    Document   : addtoshoppingcart_result
    Created on : Oct 14, 2023, 4:09:55 PM
    Author     : ratchaphum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        
            out.print("<h1>" + request.getAttribute("test0") + "</h1><br>");
            out.print("<h1>" +request.getAttribute("test1")+ "</h1><br>");
            out.print("<h1>" +request.getAttribute("test2")+"</h1>");
        
        %>
    </body>
</html>

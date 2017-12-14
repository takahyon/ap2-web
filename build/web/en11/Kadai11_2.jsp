<%-- 
    Document   : Kadai11_2
    Created on : 2017/12/14, 15:55:42
    Author     : takamasa
--%>
<%@page import="en11.Exam"%>
        
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>
            Kadai11_2.jsp
        </h3>
       
        <%
                       Exam ex = (Exam) request.getAttribute("ex");
            %>
            
            <%=ex.getName()%>, 年齢=<%=ex.getAge()%>,<%=ex.getKind()%>
            
    </body>
</html>

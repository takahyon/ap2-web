<%--
    Document   : Kadai08_1
    Created on : 2017/11/23, 15:03:58
    Author     : takamasa
--%>

<%@page import="sun.nio.cs.UTF_32"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> Kadai08_1.jsp</h3>

        <table border="1">
          <tr>
            <td>名前</td>
            <td> <%= request.getParameter("name") %> </td>
          </tr>
          <tr>
            <td>住所</td>
            <td> <%= request.getParameter("add") %> </td>
          </tr>
          <tr>
            <td>興味</td>
            <td>
            <% for(int i=1; i<7; i++) {
                String str = request.getParameter("in"+i);
                if(str != null){
                out.print(str+ "<br>");
                
                }
            }


                    %>
            </td>
          </tr>



        </table>
    </body>
</html>

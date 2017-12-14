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
        <h1> アンケート結果</h1>
<hr>
        <table border="1">
          <tr>
            <td>名前</td>
            <td> <%=request.getParameter("name")%> </td>
          </tr>
          <tr>
            <td>製品</td>
            <td> <%=request.getParameter("product")%> </td>
          </tr>
          <tr>
            <td>評価</td>
            <td> <%=request.getParameter("add")%> </td>
          </tr>
          <tr>
            <td>自由意見:</td>
            <td> <%=request.getParameter("txt")%> </td>
          </tr>



        </table>
    </body>
</html>

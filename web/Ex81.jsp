<%-- 
    Document   : Ex81
    Created on : 2017/11/21, 11:17:46
    Author     : takamasa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>
                    year
                </td>
                <td>
                    <%=request.getParameter("year")%></td>
                </td>
            </tr>
            <tr>
                <td>
                    year
                </td>
                <td>
                    <%=request.getParameter("month")%></td>
                </td>
            </tr>
            <tr>
                <td>
                    year
                </td>
                <td>
                    <%=request.getParameter("day")%></td>
                </td>
            </tr>
        </table>
    </body>
</html>

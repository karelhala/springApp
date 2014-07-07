<%-- 
    Document   : Users
    Created on : 4.7.2014, 14:43:24
    Author     : Karel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User list!</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>name</th>
                <th>surname</th>
                <th>role</th>
            </tr>
            <c:forEach var="user" items="${users}">
                
                <tr>
                    <td>
                        <c:out value="${user.getId()}"></c:out>
                    </td>
                    <td>
                        <c:out value="${user.getName()}"></c:out>
                    </td>
                    
                    <td>
                        <c:out value="${user.getSurname()}"></c:out>
                    </td>
                    
                    <td>
                        <c:out value="${user.getRole()}"></c:out>
                    </td>
                </tr>
                
            </c:forEach>
        </table>
        
        <img src="<c:url value="/resources/img/image.jpg" />" />
    </body>
</html>

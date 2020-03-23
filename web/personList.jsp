<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
        
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
    
    <table style="width:100%">
           <tr>
                <th>Imie</th>
                <th>Nazwisko</th>
                <th>Email</th>
           </tr>
        <c:forEach items="${persons}" var="person">
            <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
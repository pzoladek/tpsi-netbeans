<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    <body>
        <!-- EL: po wpisaniu html w formularzu: następuje jego interpretacja i 'wykonanie'  -->
        
        <h1>Cześć, ${person.firstName} ${person.lastName}! (to JSP)</h1>
        <h1>Cześć, <c:out value="${person.firstName}"/>! (to c:out)</h1>
        <a href = "mailto: ${person.email}">Wyslij maila</a> 
       
        
<!--        <span style='color: pink'>${person.firstName}</span>

        <script>alert('Jestem zlym hackerem i zaraz cie zjem ${person.firstName}!');</script>-->
        
           <!-- JSTL: po wpisaniu html w formularzu: normalne wyświetlenie tekstu (bez interpretacji html) -->

            
<!--        <span style='color: pink'><c:out value="${person.firstName}"/></span>-->

        <!--<script>alert('Jestem zlym hackerem i zaraz cie zjem <c:out value="${person.firstName}"/>!');</script>-->
        
      
    </body>
</html>
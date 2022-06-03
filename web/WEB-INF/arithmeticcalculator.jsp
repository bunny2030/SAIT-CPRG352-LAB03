<%-- 
    Document   : arithmeticcalculator
    Created on : 3-Jun-2022, 5:04:43 PM
    Author     : Vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            
            <br>
            
             <label>Second:</label>
            <input type="text" name="second" value="${second}">
            
            <br>
           
            <input type="submit" value="+" name="equation">
            <input type="submit" value="-" name="equation">
            <input type="submit" value="*" name="equation">
            <input type="submit" value="%" name="equation">
        </form>
            
        <p>Result: ${out}</p>
        
        <br>
        
         <a href="age">Age calculator</a>
 
    </body>
</html>

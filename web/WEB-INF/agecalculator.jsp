<%-- 
    Document   : agecalculator
    Created on : 3-Jun-2022, 4:00:05 PM
    Author     : Vaibhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>age calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br>
           
            <input type="submit" value="Age next birthday">
        </form>
       
        <p>${out}</p>
         <a href="arithmetic">Arithmetic calculator</a>
    </body>
</html>

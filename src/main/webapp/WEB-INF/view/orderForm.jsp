<%-- 
    Document   : orderForm
    Created on : Mar 31, 2020, 7:55:36 PM
    Author     : user
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Pizza</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form:form action="order/submitOrder" method="POST" modelAttribute="order">
            <p><strong>Choose bread size:</strong></p>
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname" />

            <p><strong>Choose ingredients:</strong></p>
            <input type="checkbox" name="ingredients" value="Potatoes">Potatoes<br/>
            <input type="checkbox" name="ingredients" value="Tomatoes">Tomatoes<br/>
            <input type="checkbox" name="ingredients" value="Sausage">Sausage<br/>

            <p><strong>Choose payment method:</strong></p>
            <select name="payment">
                <option value="Credit Card">Credit Card</option>
                <option value="Cash">Cash</option>
                <option value="Bitcoin">Bitcoin</option>
                <option value="Paypal">Paypal</option>
            </select>
            
            <p><strong>Your details:</strong></p>
            Name: <input type="text" name="name"/><br/>
            Age:<input type="number" name="age"/><br/>
            <br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>

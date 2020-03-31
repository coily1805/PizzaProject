<%-- 
    Document   : orderForm
    Created on : Mar 31, 2020, 7:55:36 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Pizza</title>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form action="order/submitOrder" method="POST">
            <p><strong>Choose bread size:</strong></p>
            <input type="radio" name="size" value="Large">Large<br/>
            <input type="radio" name="size" value="Medium">Medium<br/>
            <input type="radio" name="size" value="Small">Small<br/>

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
        </form>
    </body>
</html>

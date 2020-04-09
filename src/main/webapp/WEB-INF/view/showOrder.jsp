<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Order</title>
    </head>
    <body>
        <h1>You ordered a nice pizza</h1>
        <strong>Size:</strong> ${order.pizza.size.sname}
        <br/>
        <br/>
        <strong>Ingredients:</strong>
        <ul>
            <c:forEach items="${order.pizza.ingredients}" var="ingr">
                <li>${ingr.iname}</li>
                </c:forEach>
        </ul>
        <strong>Payment Method:</strong> ${order.payment.pname}
        <br/>
        <strong>Your name:</strong>${order.customer.cname}
        <br/>
        <strong>Your age:</strong> ${order.customer.cage}
        <h3>Thank you for your order</h3>
    </body>
</html>

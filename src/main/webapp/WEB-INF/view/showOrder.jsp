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
        <strong>Size:</strong> ${size}
        <br/>
        <br/>
        <strong>Ingredients:</strong>
        <ul>
            <c:forEach items="${ingredients}" var="i">
                <li>${i}</li>
            </c:forEach>
        </ul>
        <strong>Payment Method:</strong>${payment}
        <br/>
        <strong>Your name:</strong>${name}
        <br/>
        <strong>Your age:</strong>${age}
        <br/>
        <br/>
        <strong>Thank you</strong>
    </body>
</html>

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
        <style>
            .error{
                color:  red;
            }
        </style>
    </head>
    <body>
        <h1>Choose your Pizza</h1>
        <form:form action="order/process" method="POST" modelAttribute="order">
            <p><strong>Choose bread size:</strong></p>
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname" itemValue="id" />
            <form:errors path="pizza.size" cssClass="error"/>
            <hr>
            <p><strong>Choose ingredients:</strong></p>

            <form:checkboxes path="pizza.ingredients" items="${ingredients}" itemLabel="iname" itemValue="id"/>
            <form:errors path="pizza.ingredients" cssClass="error"/>
            <%--
            <c:forEach items="${ingredients}" var="ingredient">
                <input type="checkbox" name="ingredients" value="${ingredient}">${ingredient.iname}<br/>
            </c:forEach>
            --%>
            <hr>
            <p><strong>Choose payment method:</strong></p>

            <form:select path="payment" items="${payments}" itemLabel="pname" itemValue="id"/>
            <form:errors path="payment" cssClass="error"/>
            <br/>
            <p><strong>Your details:</strong></p>
            Name: <form:input path="customer.cname"/>
            <form:errors path="customer.cname" cssClass="error"/>
            <br/>
            Age:<form:input path="customer.cage"/>
            <form:errors path="customer.cage" cssClass="error"/>
            <br/>
            <br/>
            <input type="submit" value="Submit"/>

        </form:form>
    </body>
</html>

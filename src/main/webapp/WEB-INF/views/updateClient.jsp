<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/17/2024
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/home/allClients/updateClient?clientNumber=${client.clientNumber}" method="POST">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name" value="${client.name}"/>

    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname" placeholder="Surname" value="${client.surname}"/>

    <label for="patronymic">Patronymic</label>
    <input type="text" id="patronymic" name="patronymic" placeholder="Patronymic(not necessary)" value="${client.patronymic}"/>

    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="City" value="${client.city}"/>

    <label for="street">Street</label>
    <input type="text" id="street" name="street" placeholder="Street" value="${client.street}"/>

    <label for="index">Index</label>
    <input type="text" id="index" name="index" placeholder="Index" value="${client.index}"/>

    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone" value="${client.phone}"/>

    <label for="percent">Percent</label>
    <input type="number" id="percent" name="percent" placeholder="Discount Percent" value="${client.percent}"/>

    <button type="submit" id="submitButton">Add Client</button>
</form>
<script src="${pageContext.request.contextPath}/scripts/validations/addClientValidation.js"></script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/30/2024
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>Add Client</h1>
<br/>
<form action="${pageContext.request.contextPath}/home/allClients/addClient" method="POST">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name"/>

    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname" placeholder="Surname" />

    <label for="patronymic">Patronymic</label>
    <input type="text" id="patronymic" name="patronymic" placeholder="Patronymic(not necessary)" />

    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="City"/>

    <label for="street">Street</label>
    <input type="text" id="street" name="street" placeholder="Street"/>

    <label for="index">Index</label>
    <input type="text" id="index" name="index" placeholder="Index"/>

    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone"/>

    <label for="percent">Percent</label>
    <input type="number" id="percent" name="percent" placeholder="Discount Percent"/>

    <button type="submit" id="submitButton">Add Client</button>
</form>
<script src="${pageContext.request.contextPath}/scripts/addClientValidation.js"></script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/28/2024
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/home">Go home</a>
    <form action="${pageContext.request.contextPath}/home/login" method="POST">
        <label for="login-name">Login Name</label>
        <input type="text" id="login-name" name="login-name" placeholder="Login Name" />

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Password"/>
        <button type="submit" id="login-button">Login</button>
    </form>

<script src="${pageContext.request.contextPath}/scripts/validations/loginValidation.js"></script>
</body>
</html>

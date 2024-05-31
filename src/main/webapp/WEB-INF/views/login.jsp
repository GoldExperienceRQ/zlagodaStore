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
        <label for="email">Email</label>
        <input type="text" id="email" name="email" placeholder="Email" value="${requestScope.loginUser.email}"/>
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Password"/>
        <button type="submit" id="submitButton">Login</button>
    </form>
</body>
</html>

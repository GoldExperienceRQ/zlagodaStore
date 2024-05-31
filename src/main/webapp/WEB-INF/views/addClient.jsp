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
    <input type="text" id="name" name="name" placeholder="Name" value="${requestScope.client.name}"/>
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Email" value="${requestScope.client.email}"/>
    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone" value="${requestScope.client.phone}"/>
    <button type="submit" id="submitButton">Add Client</button>
</form>
</body>
</html>

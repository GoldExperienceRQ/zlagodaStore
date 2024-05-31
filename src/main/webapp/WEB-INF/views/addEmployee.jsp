<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/31/2024
  Time: 12:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>Add Employee</h1>
<br/>
<form action="${pageContext.request.contextPath}/home/allEmployees/addEmployee" method="POST">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name" value="${requestScope.employee.name}"/>
    <label for="email">Email</label>
    <input type="text" id="email" name="email" placeholder="Email" value="${requestScope.employee.email}"/>
    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone" value="${requestScope.employee.phone}"/>
    <button type="submit" id="submitButton">Add Employee</button>
</form>
</body>
</html>

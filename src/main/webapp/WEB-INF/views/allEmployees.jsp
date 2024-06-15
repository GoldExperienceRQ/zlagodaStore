<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/31/2024
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>All Employees</h1>
<br/>
<a href="${pageContext.request.contextPath}/home/allEmployees/addEmployee">Add Employee</a>

<c:forEach var="employee" items="${employees}">
    <div>
        <p id="${employee.employeeId}">${employee.employeeId}, ${employee.name}, ${employee.surname}, ${employee.patronymic}, ${employee.role}, ${employee.salary}, ${employee.dateOfBirth}, ${employee.dateOfStart}, ${employee.phoneNumber}, ${employee.city}, ${employee.street}, ${employee.index}</p>
        <a href="${pageContext.request.contextPath}/home/allEmployees/updateEmployee">Update</a>
    </div>
</c:forEach>
</body>
</html>

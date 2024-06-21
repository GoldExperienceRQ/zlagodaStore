<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/17/2024
  Time: 8:39 PM
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
<form action="${pageContext.request.contextPath}/home/allEmployees/updateEmployee?employeeId=${employee.employeeId}" method="POST">

    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name" value="${employee.name}"/>

    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname" placeholder="Surname" value="${employee.surname}"/>

    <label for="patronymic">Patronymic</label>
    <input type="text" id="patronymic" name="patronymic" placeholder="Patronymic(not necessary)" value="${employee.patronymic}"/>

    <label for="role">Position</label>
    <input type="text" id="role" name="role" placeholder="Role" value="${employee.role}"/>

    <label for="salary">Salary</label>
    <input type="number" id="salary" name="salary" min="0" max="9999999999999" step="0.0001" placeholder="Salary in dollars" value="${employee.salary}"/>

    <label for="dateOfStart">Start Date</label>
    <input type="date" id="dateOfStart" name="dateOfStart" placeholder="Start Date" value="${employee.dateOfStart}"/>

    <label for="dateOfBirth">Date Of Birth</label>
    <input type="date" id="dateOfBirth" name="dateOfBirth" placeholder="Date Of Birth" value="${employee.dateOfBirth}"/>

    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="City" value="${employee.city}"/>

    <label for="street">Street</label>
    <input type="text" id="street" name="street" placeholder="Street" value="${employee.street}"/>

    <label for="index">Index</label>
    <input type="number" id="index" name="index" placeholder="Index"value="${employee.index}"/>

    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone" value="${employee.phoneNumber}"/>

    <button type="submit" id="submitButton">Add Employee</button>


</form>
<script src="${pageContext.request.contextPath}/scripts/validations/addEmployeeValidation.js"></script>
</body>
</html>

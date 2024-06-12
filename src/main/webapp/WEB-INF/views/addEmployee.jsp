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
    <input type="text" id="name" name="name" placeholder="Name"/>

    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname" placeholder="Surname" />

    <label for="patronymic">Patronymic</label>
    <input type="text" id="patronymic" name="patronymic" placeholder="Patronymic(not necessary)" />

    <label for="position">Position</label>
    <input type="text" id="position" name="position" placeholder="Position"/>

    <label for="salary">Salary</label>
    <input type="number" id="salary" name="salary" placeholder="Salary in dollars"/>

    <label for="startDate">Start Date</label>
    <input type="date" id="startDate" name="startDate" placeholder="Start Date"/>

    <label for="dateOfBirth">Date Of Birth</label>
    <input type="date" id="dateOfBirth" name="dateOfBirth" placeholder="Date Of Birth"/>

    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="City"/>

    <label for="street">Street</label>
    <input type="text" id="street" name="street" placeholder="Street"/>

    <label for="index">Index</label>
    <input type="number" id="index" name="index" placeholder="Index"/>

    <label for="phone">Phone</label>
    <input type="text" id="phone" name="phone" placeholder="Phone"/>

    <button type="submit" id="submitButton">Add Employee</button>

    <script src="${pageContext.request.contextPath}/scripts/addEmployeeValidation.js"></script>
</form>
</body>
</html>

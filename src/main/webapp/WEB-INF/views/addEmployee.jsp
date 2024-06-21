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
    <label for="employee_id">Id</label>
    <input type="text" id="employee_id" name="employee_id" placeholder="Employee Id"/>

    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name"/>

    <label for="surname">Surname</label>
    <input type="text" id="surname" name="surname" placeholder="Surname" />

    <label for="patronymic">Patronymic</label>
    <input type="text" id="patronymic" name="patronymic" placeholder="Patronymic(not necessary)" />

    <label for="role">Position</label>
    <input type="text" id="role" name="role" placeholder="Role"/>

    <label for="salary">Salary</label>
    <input type="number" id="salary" name="salary" min="0" max="9999999999999" step="0.0001" placeholder="Salary in dollars"/>

    <label for="dateOfStart">Start Date</label>
    <input type="date" id="dateOfStart" name="dateOfStart" placeholder="Start Date"/>

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

    <script src="${pageContext.request.contextPath}/scripts/validations/addEmployeeValidation.js"></script>
</form>
</body>
</html>

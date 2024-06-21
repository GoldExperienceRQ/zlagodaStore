<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/18/2024
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>

<form action="${pageContext.request.contextPath}/home/allChecks/updateCheck?check_number=${check.checkNumber}" method="POST">

    <label for="employee-id">Employee</label>
    <select id="employee-id" name="employee-id" >
        <option value="default">Select Employee</option>
        <c:forEach var="employee" items="${employees}">
            <option value="${employee.employeeId}" ${employee.employeeId == check.employeeId ? "selected": ''}>${employee.name}</option>
        </c:forEach>
    </select>

    <label for="client-id">Client</label>
    <select id="client-id" name="client-id" >
        <option value="default">Select Client</option>
        <c:forEach var="client" items="${clients}">
            <option value="${client.clientNumber}" ${client.clientNumber == check.clientId ? "selected": ''}>${client.name}</option>
        </c:forEach>
    </select>

    <label for="print-date">Print Date</label>
    <input type="datetime-local" id="print-date" name="print-date" placeholder="Print Date" value="${check.printDate}"/>

    <label for="sum">Sum</label>
    <input type="number" id="sum" name="sum" min="0" max="9999999999999" step="0.0001" placeholder="Sum" value="${check.sum}"/>


    <button type="submit" id="submitButton">Add Check</button>

    <script src="${pageContext.request.contextPath}/scripts/validations/addCheckValidation.js"></script>
</form>
</body>
</html>

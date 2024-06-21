<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/18/2024
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>All checks</h1>
<br/>
<a href="${pageContext.request.contextPath}/home/allChecks/addCheck">Add Check</a>
<br/>
<c:forEach var="check" items="${checks}">

    <div>
        <p id="${check.checkNumber}">Check: ${check.checkNumber}, Employee: ${check.employeeId}, Client: ${check.clientId}, ${check.printDate}, ${check.sum}, ${check.vat}</p>

        <button type="button" class="check-update-btn">Update</button>
        <button type="button" class="check-delete-btn">Delete</button>
    </div>
</c:forEach>

<script src="${pageContext.request.contextPath}/scripts/checkMethods/updateCheck.js"></script>
<script src="${pageContext.request.contextPath}/scripts/checkMethods/deleteCheck.js"></script>
</body>
</html>

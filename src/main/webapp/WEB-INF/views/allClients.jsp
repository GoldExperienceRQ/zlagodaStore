<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/30/2024
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>All clients</h1>
<br/>
<a href="${pageContext.request.contextPath}/home/allClients/addClient">Add Client</a>

<c:forEach var="client" items="${clients}">
    <div>
        <p id="${client.clientNumber}">${client.clientNumber}, ${client.name}, ${client.surname}, ${client.patronymic}, ${client.city}, ${client.street}, ${client.index}, ${client.percent}</p>
        <button type="button" class="update-client-btn">Update</button>
        <button type="button" class="delete-client-btn">Delete</button>
    </div>
</c:forEach>


<script src="${pageContext.request.contextPath}/scripts/clientMethods/deleteClient.js"></script>
<script src="${pageContext.request.contextPath}/scripts/clientMethods/updateClientt.js"></script>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/30/2024
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>All categories</h1>
<br/>
<a href="${pageContext.request.contextPath}/home/allCategories/addCategory">Add Category</a>

<c:forEach var="category" items="${categories}">
    <div>
        <p id="${category.id}">${category.id}, ${category.name}</p>
        <button type="button" class="update-category-btn">Update</button>
        <button type="button" class="delete-category-btn">Delete</button>
    </div>
</c:forEach>


<script src="${pageContext.request.contextPath}/scripts/categoryMethods/deleteCategory.js"></script>
<script src="${pageContext.request.contextPath}/scripts/categoryMethods/updateCategory.js"></script>
</body>
</html>

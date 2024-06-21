<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/17/2024
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>Add category</h1>
<br/>
<form action="${pageContext.request.contextPath}/home/allCategories/updateCategory?categoryId=${category.id}" method="POST">
    <label for="category-name">Category Name</label>
    <input type="text" id="category-name" name="category-name" placeholder="Category Name" value="${category.name}"/>
    <button type="submit" id="submitButton">Update</button>
</form>
<script src="${pageContext.request.contextPath}/scripts/validations/addCategoryValidation.js"></script>
</body>
</html>

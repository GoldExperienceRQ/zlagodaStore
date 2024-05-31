
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/31/2024
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>Add product in store</h1>
<br/>
<form action="${pageContext.request.contextPath}/home/allProductsInStore/addProductInStore" method="POST">
    <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="Name"/>
    <label for="price">Price</label>
    <input type="text" id="price" name="price" placeholder="Price"/>
    <label for="quantity">Quantity</label>
    <input type="text" id="quantity" name="quantity" placeholder="Quantity"/>
    <label for="category">Category</label>
    <input type="text" id="category" name="category" placeholder="Category">
    <button type="submit" id="submitButton">Add</button>
</form>
</body>
</html>

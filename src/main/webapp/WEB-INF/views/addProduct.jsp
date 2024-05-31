<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/30/2024
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    //write add product interface
    <form action="${pageContext.request.contextPath}/home/allProducts/addProduct" method="POST">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" placeholder="Name" value="${requestScope.product.name}"/>
        <label for="price">Price</label>
        <input type="text" id="price" name="price" placeholder="Price" value="${requestScope.product.price}"/>
        <label for="description">Description</label>
        <input type="text" id="description" name="description" placeholder="Description" value="${requestScope.product.description}"/>
        <button type="submit" id="submitButton">Add Product</button>
    </form>
</body>
</html>

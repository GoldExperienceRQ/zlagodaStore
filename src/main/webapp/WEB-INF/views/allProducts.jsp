<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/30/2024
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/home">Go home</a>
    <h1>All products</h1>
    <br/>
    <a href="${pageContext.request.contextPath}/home/allProducts/addProduct">Add Product</a>
    <br/>
<c:forEach var="product" items="${products}">

        <div>
            <p id="${product.id}">${product.id}, ${product.name}, ${categoryMap[product.category]}, ${product.description}</p>

            <button type="button" class="product-update-btn">Update</button>
            <button type="button" class="product-delete-btn">Delete</button>
        </div>
    </c:forEach>

<script src="${pageContext.request.contextPath}/scripts/productMethods/updateProduct.js"></script>
    <script src="${pageContext.request.contextPath}/scripts/productMethods/deleteProduct.js"></script>
</body>
</html>

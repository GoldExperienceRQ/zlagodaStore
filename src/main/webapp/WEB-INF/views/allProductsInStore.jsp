<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 5/31/2024
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>All products in store</h1>
<br/>
<a href="${pageContext.request.contextPath}/home/allProductsInStore/addProductInStore">Add Product</a>
<br/>

<c:forEach  var="productInStore" items="${productsInStore}">
    <p id="${productInStore.upc}">${productMap[productInStore.id]}, ${productInStore.price}, ${productInStore.quantity}, ${productInStore.isPromotional}</p>
    <button type="button" class="productInStore-update-btn">Update</button>
    <button type="button" class="productInStore-delete-btn">Delete</button>
</c:forEach>

<script src="${pageContext.request.contextPath}/scripts/productInStoreMethods/deleteProductInStore.js"></script>
<script src="${pageContext.request.contextPath}/scripts/productInStoreMethods/updateProductInStore.js"></script>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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


    <label for="upc">Upc of the product</label>
    <input type="text" id="upc" name="upc" placeholder="Upc">

    <label for="id-product">Id of the product</label>
    <select id="id-product" name="id-product">
        <option value="default">Product Id</option>
        <c:forEach var="product" items="${products}">
            <option value="${product.id}">${product.name}</option>
        </c:forEach>
    </select>


    <label for="price">Price</label>
    <input type="number" id="price" name="price" min="0" max="9999999999999" step="0.0001" placeholder="Price"/>

    <label for="quantity">Quantity</label>
    <input type="number" id="quantity" name="quantity" placeholder="Quantity"/>

    <label for="is-promotional">Is promotional</label>
    <input type="checkbox" id="is-promotional" name="is-promotional"/>

    <button type="submit" id="submitButton">Add</button>

    <script src="${pageContext.request.contextPath}/scripts/validations/addProductInStoreValidation.js"></script>
</form>
</body>
</html>

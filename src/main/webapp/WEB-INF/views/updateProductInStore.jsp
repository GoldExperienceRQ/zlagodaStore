<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/17/2024
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>
<h1>Update product in store</h1>
<br/>
<form action="${pageContext.request.contextPath}/home/allProductsInStore/updateProductInStore?upc=${productInStore.upc}" method="POST">

    <label for="id-product">Id of the product</label>
    <select id="id-product" name="id-product">
        <option value="default">Product Id</option>
        <c:forEach var="product" items="${products}">
            <option value="${product.id}" ${product.id == productInStore.id ? "selected": ''}>${product.name}</option>
        </c:forEach>
    </select>

    <label for="price">Price</label>
    <input type="number" id="price" name="price" min="0" max="9999999999999" step="0.0001" placeholder="Price" value="${productInStore.price}"/>

    <label for="quantity">Quantity</label>
    <input type="number" id="quantity" name="quantity" placeholder="Quantity" value="${productInStore.quantity}"/>

    <label for="is-promotional">Is promotional</label>
    <input type="checkbox" id="is-promotional" name="is-promotional" ${productInStore.isPromotional == true ? "checked": ""}/>

    <button type="submit" id="submitButton">Add</button>

    <script src="${pageContext.request.contextPath}/scripts/validations/addProductInStoreValidation.js"></script>
</form>
</body>
</html>

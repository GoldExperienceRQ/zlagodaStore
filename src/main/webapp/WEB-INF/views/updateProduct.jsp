
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valen
  Date: 6/16/2024
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Go home</a>

<form action="${pageContext.request.contextPath}/home/allProducts/updateProduct?productId=${product.id}" method="POST">

    <label for="product-name">Product Name</label>
    <input type="text" id="product-name" name="product-name" placeholder="Product Name" value="${product.name}"/>

    <label for="category">Category</label>
    <select id="category" name="category" >
        <option value="default">Select Category</option>
        <c:forEach var="category" items="${categories}">
            <option value="${category.id}" ${category.id == product.category ? "selected": ''}>${category.name}</option>
        </c:forEach>
    </select>



    <label for="characteristics">Characteristics</label>
    <input type="text" id="characteristics" name="characteristics" placeholder="Characteristics" value="${product.description}"/>

    <button type="submit" id="submitButton">Update Product</button>

    <script src="${pageContext.request.contextPath}/scripts/validations/addProductValidation.js"></script>
</form>
</body>
</html>

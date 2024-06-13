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
<a href="${pageContext.request.contextPath}/home">Go home</a>

    <form action="${pageContext.request.contextPath}/home/allProducts/addProduct" method="POST">

        <label for="product-name">Product Name</label>
        <input type="text" id="product-name" name="product-name" placeholder="Product Name"/>

        <label for="category">Category</label>
        <select id="category" name="category" >
                <option value="default">Select Category</option>
                <option value="1">Option 1</option>
        </select>

        <label for="characteristics">Characteristics</label>
        <input type="text" id="characteristics" name="characteristics" placeholder="Characteristics"/>

        <button type="submit" id="submitButton">Add Product</button>

        <script src="${pageContext.request.contextPath}/scripts/validations/addProductValidation.js"></script>
    </form>
</body>
</html>

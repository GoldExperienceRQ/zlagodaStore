
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
    <label for="id-product">Id of the product</label>
    <select id="id-product" name="id-product">
        <option value="">Product</option>
    </select>

    <label for="price">Price</label>
    <input type="number" id="price" name="price" placeholder="Price"/>

    <label for="amount">Amount</label>
    <input type="number" id="amount" name="amount" placeholder="Amount"/>

    <label for="is-on-sale">Is on sale</label>
    <input type="checkbox" id="is-on-sale" name="is-on-sale"/>

    <button type="submit" id="submitButton">Add</button>
</form>
</body>
</html>

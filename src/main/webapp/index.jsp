<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="styles/indexStyle.css">
</head>
<body>
<h1><%= "Zlagoda Store" %>
</h1>
<br/>
<% if (session.getAttribute("isLoggedIn") == null || !(boolean) session.getAttribute("isLoggedIn")) { %>
<a href="${pageContext.request.contextPath}/home/login">Login</a>
<% } %>
<% if (session.getAttribute("isLoggedIn") != null && (boolean) session.getAttribute("isLoggedIn")) { %>
<br/>
<a href="${pageContext.request.contextPath}/home/logout">Logout</a>
<br/>
<% if (session.getAttribute("user_role").equals("admin")) { %>
<a href="${pageContext.request.contextPath}/home/allProducts">All Products</a>
<br/>
<a href="${pageContext.request.contextPath}/home/allClients">All Clients</a>
<br/>
<a href="${pageContext.request.contextPath}/home/allCategories">All Categories</a>
<br/>
<a href="${pageContext.request.contextPath}/home/allEmployees">All Employees</a>
<br/>
<a href="${pageContext.request.contextPath}/home/allProductsInStore">All Products In Store</a>
<br/>
<%}%>

<a href="${pageContext.request.contextPath}/home/allChecks">All Checks</a>

<% } %>
<br/>
<br/>

<a href="${pageContext.request.contextPath}/home/complexQueryOne">Execute Complex Query One</a>
<br/>
<a href="${pageContext.request.contextPath}/home/complexQueryTwo">Execute Complex Query Two</a>
</body>
</html>
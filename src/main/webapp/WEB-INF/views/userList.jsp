<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.05.2017
  Time: 0:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>List of Users</h1>


<p>
<ol>
    <c:forEach var="user" items = "${showUsers}">
    <li> ${user.firstName} ${user.lastName} <a href = "/deleteUser/${user.id}"> Delete</a>
        <a href = "/updateUser/${user.id}"> Update</a>
        </c:forEach>
</ol>

<br>

<a href="/registration">Back to registration</a>
<br>
<br>
<a href="/">Go Home</a>

</body>
</html>

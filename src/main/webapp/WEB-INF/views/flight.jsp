<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.05.2017
  Time: 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 style = "text-align: center">Flights</h1>

<form method = "post" action="/flightList" title="Find a flight">

    <select>

        <option value="" selected>City</option>
        <c:forEach var = "city" items = "${cities}">
            <option>${city.name}</option>
        </c:forEach>

    </select>

    <input type = "date">


    <button>Look up</button>


</form>

<p>
<p>
<br>
<br>
<div>
<sf:form method = "post" modelAttribute="flight" action="/saveFlight">


    <sf:select path = "city" items="${cities}" itemLabel="name" itemValue="id" placeholder = "City" />

    <input name="departur" type = "Date"/>

    <%--<sf:input path="departureDate" type = "Date"/>--%>

        <%--<input type = "checkbox">Tuesday--%>
        <%--<input type = "checkbox">Friday--%>

    <%--<sf:input path = "" type = "time" name="departureTime"/>--%>

    <button>Save flight</button>
</sf:form>

</div>

<br>
<br>
<br>

<a href = "/flightList"><button>View flights</button></a>

<br>
<br>
<a href = "/">Go home</a>

</body>
</html>

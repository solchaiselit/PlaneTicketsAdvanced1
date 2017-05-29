<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.05.2017
  Time: 2:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<ol>
<c:forEach var="flight" items ="${flights}">

    <li>${flight.city.name} ${flight.departureDate}${flight.id}
        <%--<sf:form method="post" modelAttribute="flight">--%>

            <%--<sf:select path="freeSeats" items="${freeSeats}" itemValue="id" placeholder = "Free Seats"/>--%>
        <%--</sf:form>--%>

           <%-- <sf:form method="post" modelAttribute="flight">

            <sf:select path="freeSeats" items="${freeSeats}" itemLabel="seatNumber" itemValue="id"/>
            </sf:form>--%>

        <a href="/deleteFlight/{flight.id}">Delete</a>
        <a href="/updateFlight{flight.id}">Update</a>
        <a href="/addUserToFlight{flight.id}">Add user</a>
    </li>

</c:forEach>

</ol>



<br>
<br>

<a href = "/">Go home</a>
<br>
<br>
<a href = "/flight">Back to Flights</a>

</body>
</html>

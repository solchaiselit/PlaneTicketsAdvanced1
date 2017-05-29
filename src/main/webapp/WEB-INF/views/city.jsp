<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style = "text-align: center"> City</h1>

<form action = "/city" method = "post">

	<input type = "text" name = "city"> 
	<button> Save city</button>
</form>

<ol>


    <c:forEach var = "city" items = "${cities}">

    <%--<c:if test="${city.id ge 1}">--%>
	<li>${city.name}<a href = "/deleteCity/${city.id}"> Delete</a>
					<a href = "/updateCity/${city.id}"> Update</a>

        <%--</c:if>--%>
    </c:forEach>
</ol>



<p>
    <br>
    <br>
<a href = "/">Go home</a>


</body>


</html>
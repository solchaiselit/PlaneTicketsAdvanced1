<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib prefix = "sf" uri ="http://www.springframework.org/tags/form" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="/css/registration.css" type="text/css"/>
	<script src="/js/registration.js"></script>
</head>
<body>

<div id="registration-form">
	<div class='fieldset'>
		<legend>User Registration</legend>
		<sf:form method="post" modelAttribute="user" data-validate="parsley">
			<div class='row'>
				<%--<label for='firstname'>First Name</label>--%>
				<h3 style = "text-align: center; color: red">${firstnameException}</h3>
				<sf:input path="firstName" type="text" placeholder="First Name" name='firstname' id='firstname' data-required="true" data-error-message="Your First Name is required"/>
			</div>

			<div class='row'>
				<%--<label for='lastname'>Last Name</label>--%>
						${usernameException}
				<sf:input path="lastName" type="text" placeholder="Last Name" name='firstname' id='firstname' data-required="true" data-error-message="Your First Name is required"/>
			</div>

			<div class='row'>
				<%--<label for="email">E-mail</label>--%>
				${useremailException}
				<sf:input path="email" type="text" placeholder="E-mail"  data-required="true" data-type="email" data-error-message="Your E-mail is required"/>
			</div>
			<div class='row'>
				<%--<label for="cemail">Password</label>--%>
				<sf:input path="password" type="password" placeholder="Password" name='cemail' data-required="true" data-error-message="Your E-mail must correspond"/>
			</div>
			<input type="submit" value="Register">
		</sf:form>
	</div>
</div>

<%--<h1 style = "text-align: center">Registration</h1>--%>

	<%--<sf:form  modelAttribute="user" method = "post">--%>

	<%--<sf:input path="firstName"/> First name--%>
	<%--<br><br>--%>
	<%--<sf:input path="lastName"/> Last name--%>
	<%--<br><br>--%>
	<%--<sf:input path="email"/> Email--%>
	<%--<br><br>--%>
	<%--<sf:input path="password"/> Password--%>
	<%--<br><br>--%>
	<%--<button>Register</button>--%>
		<%----%>
	<%--</sf:form>--%>
<p>
<%--<sf:form modelAttribute="user" action="/user1" method = "post" id="ssform">--%>
	<%--<fieldset>--%>
	<%--<sf:input type="text" path = "firstName" placeholder = "FirstName"/> First name--%>
	<%--<br><br>--%>
	<%--<sf:input type="text" path = "lastName"/> Last name--%>
	<%--<br><br>--%>
	<%--<sf:input type="email" path = "email"/> Email--%>
	<%--<br><br>--%>
	<%--<sf:input type="password" path = "password"/> Password--%>
	<%--<br><br>--%>
	<%--<button>Register</button>--%>
	<%--</fieldset>--%>
<%--</sf:form>--%>
<p>
<div style="align-content: center">
<form action="/showUsers" method = "post">

	<button>List of users</button>
</form>



<p>
<a href ="/">Go home</a>
</p>

	</div>

</body>

</html>
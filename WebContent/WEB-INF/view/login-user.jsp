<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>


<html>

	<head>
		<title> Login </title>


	</head>
	
	<form:form action="loginUser" modelAttribute="accToLogin" >
	
	Username <form:input path="accName" /> <br>
	Password: <form:password path="password" /> <br>
	<input type="submit" value="Submit">
	
	</form:form>


	<body>

	</body>

</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>


<html>

	<head>
		<title> Register </title>


	</head>

	<body>
	
		<form:form action="verifyReg" modelAttribute="account" >
		
		Username: <form:input path="accName" />
		<form:errors path="accName" /> <br>
		
		Password: <form:password path="password" /> 
		<form:errors path="password" /> <br>
		
		<input type="submit" value="Submit" />
		
		</form:form>
	
	</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order System</title>
</head>
<body>

	<div id ="wrapper">
		
		<div id ="header">
		
			<h2> Welcome back ${accToLogin.accName}! </h2>
		</div>

	</div>
	
	<div id="container">
	
		<div id="content">
		
		
		
		<form:form action="submitAction" modelAttribute="choice">
		
		What do you want to do? <form:select path="choice">
		
		<form:option value="See orders" label="See orders"/>
		<form:option value="Place order" label="Place order" />
		<form:option value="Account info" label= "Account info"/>

		</form:select>

		<input type="submit" value="Go"/>
		</form:form>
		
		</div>
	
	</div>
	

</body>
</html>
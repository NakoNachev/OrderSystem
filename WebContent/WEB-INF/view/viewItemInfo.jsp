<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Items</title>


</head>
<body>


	<div id="wrapper">
		<div id = "header">
		
			<h2> Current available items </h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">

		<table>
		
			<tr>
			
				<th> Item id </th>
				<th> Category id </th>
				<th> Item name </th>
				<th> Available amount </th>

				</tr>

				
				<c:forEach items="${items}" var="tempItem">
				<tr>
					<td> ${tempItem.ID } </td>
					<td> ${tempItem.itemCategory.id } </td>
					<td> ${tempItem.itemName} </td>
					<td> ${tempItem.availableAmount} </td>
				</tr>	
				</c:forEach>



		
		</table>
		
		<a href="loginUser"> Go back to home page</a>
		
		</div>
	
	
	</div>

</body>
</html>
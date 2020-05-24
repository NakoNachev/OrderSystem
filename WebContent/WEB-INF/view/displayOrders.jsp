<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders</title>


</head>
<body>


	<div id="wrapper">
		<div id = "header">
		
			<h2> Outstanding orders </h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">

		<table>
		
			<tr>
			
				<th> Order id </th>
				<th> Courier id </th>
				<th> Delivery Date </th>
				<th> Order Date </th>

				</tr>
				
				<tr>
				
				<c:forEach items="${orders}" var="tempOrder">

					<td> ${tempOrder.id } </td>
					<td> ${tempOrder.deliveryDate } </td>
					<td> ${tempOrder.orderSetDate } </td>
					
				</c:forEach>
				</tr>


		
		</table>
		
		</div>
	
	
	</div>

</body>
</html>
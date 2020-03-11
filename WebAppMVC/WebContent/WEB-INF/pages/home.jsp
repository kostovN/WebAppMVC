<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<form action="../application/home" method="post">
	<table>
			<tr>
				<td><c:out value = "${sessionScope.loginMessage}"></c:out></td>
				<td><a href="../application/login">Log out</a></td>
			</tr>
			<tr>
				<td><a href="../application/city?operation=all">All cities</a></td>
			</tr>
			<tr>
				<td><a href="../application/city?operation=new">New city</a></td>
			</tr>
			<tr>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="../application/login" method="post">
	<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit"  id="login" name="login" value="Log in"/></td>
				<td><c:out value = "${requestScope.notExists}"></c:out></td>
			</tr>
			<tr>
				<td colspan = "2"><c:out value = "${requestScope.validationError}"></c:out></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
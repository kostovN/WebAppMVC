<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../application/city?operation=save" method="post">
	<table>
			<tr>
				<td>PTT: </td>
				<td><input type="text" id="ptt" name="ptt" /></td>
			</tr>
			<tr>
				<td>Name: </td>
				<td><input type="text" id="name" name="name" /></td>
			</tr>
			<tr>
				<td><input type="submit"  id="save" name="action" value="Save"/></td>
			</tr>
			<tr><td><c:out value = "${requestScope.validationError}"></c:out></td></tr>
			<tr><td><a href="../application/city?operation=back">Back</a></td></tr>
		</table>
	</form>

</body>
</html>
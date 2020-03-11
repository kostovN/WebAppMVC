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
<form action="../application/city?operation=editCity" method="post">
		<table>
			<tr>
				<td>Edit city</td>

			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="name1" name="name1" /></td>
				<td><input type="hidden" id="ptt1" name="ptt1"
					value="${param.ptt}" /></td>
			</tr>
			<tr>
				<td><input type="submit" id="edit" name="action" value="Edit" /></td>
			</tr>
			<tr>
				<td><c:out value="${requestScope.validationError}"></c:out></td>
			</tr>
			<tr>

				<td><a href="../application/city?operation=back">Back</a></td>
			</tr>
		</table>
	</form>

</body>
</html>
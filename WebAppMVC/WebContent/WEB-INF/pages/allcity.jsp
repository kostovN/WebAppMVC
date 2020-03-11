<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../application/city" method="post">
		<table>
			<tr>
				<td><c:out value="${sessionScope.loginMessage}"></c:out></td>
				<td><a href="../application/login">Log out</a></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>PTT</td>
			</tr>
			<c:forEach items="${applicationScope.cities}" var="city">

				<c:url value="../application/city" var="editURL">
					<c:param name="operation" value="edit" />
					<c:param name="ptt" value="${city.ptt}" />
				</c:url>
				<c:url value="../application/city" var="removeURL">
					<c:param name="operation" value="remove" />
					<c:param name="ptt" value="${city.ptt}" />
				</c:url>
				<tr>
					<td>${city.name}</td>
					<td>${city.ptt}</td>
					<td><a href="<c:out value = "${editURL}"/>">Edit</a></td>
					<td><a href="<c:out value = "${removeURL}"/>">Remove</a></td>

				</tr>
			</c:forEach>
			<tr>
				<td><c:out value="${requestScope.listIsEmpty}"></c:out></td>
			</tr>
			<tr>
				<td><a href="../application/city?operation=back">Back</a></td>
			</tr>
		</table>
	</form>

</body>
</html>
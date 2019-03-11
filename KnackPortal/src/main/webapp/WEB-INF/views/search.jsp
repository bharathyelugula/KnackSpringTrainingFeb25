<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;

</style>
</head>
<body background="images/m4.jpg">
<h1>Search Results:-</h1>
<table>
<tbody>
<tr><th>ID</th><th>Name</th><th>Department</th><th>Role</th></tr>
<c:forEach items="${emp}" var="emp">
<tr><td><c:out value="${emp.getId()}"></c:out></td>
<td><c:out value="${emp.getName()}"></c:out></td>
<td><c:out value="${emp.getDepartment()}"></c:out></td>
<td><c:out value="${emp.getRole()}"></c:out></td>
</tr>
</c:forEach>
</tbody>
</table>
<center><form action="login1">
<input type="submit" value="Back to home"></form></center>
</body>
</html>
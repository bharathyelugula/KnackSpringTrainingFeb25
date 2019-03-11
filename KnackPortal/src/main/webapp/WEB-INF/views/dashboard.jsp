<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<style type="text/css">
body {
	background-image:
}

div {
	text-align: right;
	color:white;
}
</style>
</head>
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</SCRIPT>
</HEAD>
<BODY onload="noBack();" onpageshow="if (event.persisted) noBack();"
	onunload="" background="images/back.jpg">
	<center>
		<img alt="Knack Systems" src="images/logo.png" width="510px"
			height="200px">
	</center>
	<h1 style="color: white;">Welcome ${login.getId()}</h1>
	<div>
		<h2>Name:- ${emp.getName()}</h2>
		<h2>Role:- ${emp.getRole()}</h2>
		<h2>Employee Id:- ${emp.getId()}</h2>
	</div>
	<form action="search" method="get">
		<input type="text" placeholder="Search.." name="emp"> <input
			type="submit" value="Search">
	</form>
	<form action="logout">
		<input type="submit" value="Log Out" />
	</form>
</body>
</html>
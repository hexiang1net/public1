<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr><td> user name </td></tr>
	<c:forEach var="name" items="${ list}">
		<tr><td>${name.name }</td></tr>
	</c:forEach>
	
</table>
<div><h1><%=request.getAttribute("shit") %></h1></div>
<div><h1>${requestScope.shit }</h1></div>
</body>
</html>
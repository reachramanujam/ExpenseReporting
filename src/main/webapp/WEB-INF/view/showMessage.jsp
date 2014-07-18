<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<sql:query var="rs" dataSource="jdbc/expensetracking">
	select id, name, description from expensetype
</sql:query>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
	Request Attribute : <%= request.getAttribute("message")%>
		<h2>${message}</h2>
		<c:out value="${message}"></c:out>
		
		<c:forEach var="row" items="${rs.rows}">
			Foo ${row.name}<br/>
		</c:forEach>
		
	</body>
</html>

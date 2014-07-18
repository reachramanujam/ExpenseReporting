<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css?v=1" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="${pageContext.request.contextPath}/docreate" commandName="expenseType">
<table class="formtable">
	<tr>
		<td class="label">Name:</td>
		<td><form:input type="text" path="name" name="name"/><br><form:errors path="name" cssClass="error"></form:errors></td>		
	</tr>
	<tr>
		<td class="label">Description:</td>
		<td><form:input type="text" path="description" name="description"/><br><form:errors path="description" cssClass="error"></form:errors></td>		
	</tr>
	<tr>
		<td colspan="1"><input type="submit" value="Add ExpenseType"/></td>
	</tr>
</table>
</form:form>


</body>
</html>
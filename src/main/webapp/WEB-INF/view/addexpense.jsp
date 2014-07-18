<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add expense page under construction;<form:form method="post" action="${pageContext.request.contextPath}/expense/docreate" commandName="expense">
<table class="formtable">
	<tr>
		<td class="label">Expense Type:</td>
		<td><form:input type="text" path="expenseType" name="expenseType"/><br><form:errors path="expenseType" cssClass="expenseType"></form:errors></td>		
	</tr>
	<tr>
		<td class="label">Expense Description:</td>
		<td><form:input type="text" path="description" name="description"/><br><form:errors path="description" cssClass="description"></form:errors></td>		
	</tr>
	<tr>
		<td class="label">Amount:</td>
		<td><form:input type="text" path="amount" name="amount"/><br><form:errors path="amount" cssClass="amount"></form:errors></td>		
	</tr>
	<tr>
		<td class="label">Date Incurred:</td>
		<td><form:input type="text" path="dateOcurred" name="dateOcurred"/><br><form:errors path="dateOcurred" cssClass="dateOcurred"></form:errors></td>		
	</tr>
	<tr>
		<td colspan="1"><input type="submit" value="Add Expense"/></td>
	</tr>
</table>
</form:form>
</body>
</html>
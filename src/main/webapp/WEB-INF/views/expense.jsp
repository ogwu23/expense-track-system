<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<c:set var="contextRoot" value="${pageContext.request.contextPath }" /> 
<!DOCTYPE html>
<html>
<head>


<form:form action="${contextRoot }/expense" method ="post" modelAttribute="expense">

<form:hidden path="id" />

<form:input path="expensename" placeholder="Enter expense name"/>

<form:input path="amount" placeholder="Enter expense amount"/>

<form:textarea path="note" placeholder="Enter note(optional)"/>

<button type="submit">Add Expense</button>
</form:form>
 
  <a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Insert title here</title>
</head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 30%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: whitesmoke;
}
input { /* Default input */
    border: solid 1px;
    border-color: #D9D9D9;
    width:350px;
    height:30px;
}
input:focus {   /* Selected input */
    border-color: #4D90FE;
}
button{
	border:none;
	cursor: pointer;
	padding:10px 16px;
}
</style>
<body>
	<form:form id="form-evaluator" method="post" action="/evaluate">
		<div align="center">
			<h2>Program to evaluate expression</h2>
			<input type="text" id="expressionId" name="expression"
				value="${expression}" />
			<h4>
				Result is: <span id="result-span">${expressionResult}</span>
			</h4>
			<div>
				<button onclick="evaluateExpression()">Evaluate</button>
			</div>
		</div>
	</form:form>

	<div align="left">
		<h3>Expression History</h3>
		<table>
			<thead>
				<tr>
					<td>Expression</td>
					<td>Result</td>
				</tr>
			</thead>
			<c:forEach items="${history}" var="obj">
				<tr>
					<td>${obj.expression}</td>
					<td>${obj.result}</td>
				</tr>
			</c:forEach>

		</table>
	</div>
	<script>
		function evaluateExpression() {
			var expr = document.getElementById("expressionId").value;
			if (expr != "") {
				var formId = document.getElementById("form-evaluator");
				formId.submit();
			}

		}
	</script>
</body>
</html>
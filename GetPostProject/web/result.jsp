<%@ page language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h2>Calculator Result</h2>
<%
    double res = (Double)request.getAttribute("result");
%>
<h3>Result: <%= res %></h3>
<br>
<a href="index.jsp">Back to Calculator</a>
</body>
</html>
<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
%>

<html>
<body>

<h2>User Details</h2>

Name: <%= name %><br>
Email: <%= email %>

</body>
</html>
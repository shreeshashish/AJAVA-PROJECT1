<%
  String user = request.getParameter("user");
  session.setAttribute("username", user);
%>

Welcome <%= session.getAttribute("username") %>
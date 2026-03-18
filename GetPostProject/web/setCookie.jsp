<%
    Cookie c = new Cookie("username","Shreesha");
    c.setMaxAge(60*60);
    response.addCookie(c);
%>

Cookie Set Successfully
<br>
<a href="getCookie.jsp">Get Cookie</a>
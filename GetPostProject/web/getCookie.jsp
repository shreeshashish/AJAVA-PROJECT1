<%
    Cookie cookies[] = request.getCookies();

    for(Cookie c : cookies)
    {
        if(c.getName().equals("username"))
        {
            out.println("Username : " + c.getValue());
        }
    }
%>
//To create a login form using dopost();
package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class login extends HttpServlet {
    public void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = rq.getParameter("username");
        String password = rq.getParameter("password");
        if ("admin".equals(username) && "1234".equals(password))
        {
            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome, " + username + "</p>");
        }
        else {
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid Username or Password</p>");
        }
    }
}
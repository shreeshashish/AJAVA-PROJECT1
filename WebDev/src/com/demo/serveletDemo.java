package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class serveletDemo extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2> Welcome"+name+"</h2>");
        out.println("<h2> Your email"+email+"</h2>");

    }
}

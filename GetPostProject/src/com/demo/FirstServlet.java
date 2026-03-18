package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        out.println("<h3>Click the link to continue</h3>");

        out.println("<a href='SecondServlet?username=" + name + "'>Go to Next Servlet</a>");
    }
}
package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StoreName extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("uname", name);

        out.println("<h2>Name stored in session</h2>");
        out.println("<a href='DisplayName'>Click here to see welcome message</a>");
    }
}
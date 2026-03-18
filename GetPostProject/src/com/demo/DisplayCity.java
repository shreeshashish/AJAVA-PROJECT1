package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayCity extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie cookies[] = request.getCookies();

        for(Cookie c : cookies) {
            if(c.getName().equals("userCity")) {
                out.println("<h2>Your City is: " + c.getValue() + "</h2>");
            }
        }
    }
}
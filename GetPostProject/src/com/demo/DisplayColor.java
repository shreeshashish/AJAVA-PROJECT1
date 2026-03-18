package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayColor extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie cookies[] = request.getCookies();

        for(Cookie c : cookies) {
            if(c.getName().equals("favColor")) {
                out.println("<h2>Your Favorite Color is: " + c.getValue() + "</h2>");
            }
        }
    }
}
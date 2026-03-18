package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StoreCity extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String city = request.getParameter("city");

        Cookie ck = new Cookie("userCity", city);   // create cookie
        response.addCookie(ck);                     // add cookie

        out.println("<h3>City stored in cookie</h3>");
        out.println("<a href='DisplayCity'>Click to see your city</a>");
    }
}
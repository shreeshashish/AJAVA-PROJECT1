package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StoreColor extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String color = request.getParameter("color");

        Cookie ck = new Cookie("favColor", color);   // create cookie
        response.addCookie(ck);                      // add cookie

        out.println("<h3>Favorite color stored successfully</h3>");
        out.println("<a href='DisplayColor'>Click here to see your favorite color</a>");
    }
}
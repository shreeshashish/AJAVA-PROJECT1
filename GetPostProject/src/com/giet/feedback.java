package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class feedback extends HttpServlet {
    public void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException {
        String name = rq.getParameter("name");
        String feedback = rq.getParameter("feedback");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Feedback</h2>");
        out.println("<p>Name:"+ name+"</p>");
        out.println("<p>Feedback:"+ feedback+"</p>");
    }
}
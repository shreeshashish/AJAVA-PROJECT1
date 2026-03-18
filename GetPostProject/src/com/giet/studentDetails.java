package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class studentDetails extends HttpServlet {
    public void doGet(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException
    {
        String rollno = rq.getParameter("student_roll");
        String name = rq.getParameter("student_name");
        String course = rq.getParameter("student_course");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Given Student details are</h2>");
        out.println("<p>Rollno: " + rollno + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Course: " + course + "</p>");
    }
}
//student registration page with name age course gender as radiobutton
package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class registration extends HttpServlet {
    public void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException
    {
        String name = rq.getParameter("student_name");
        String age = rq.getParameter("student_age");
        String gender = rq.getParameter("student_gender");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Student details are</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
        out.println("<p>Gender: " + gender + "</p>");
    }
}
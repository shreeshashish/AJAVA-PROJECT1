package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class employee extends HttpServlet {
    public void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException
    {
        String name =rq.getParameter("name");
        String salary=rq.getParameter("salary");
        String Department =rq.getParameter("department");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Employee details</h2>");
        out.println("<h3>Name: "+name+"</h3>");
        out.println("<h3>Salary: "+salary+"</h3>");
        out.println("<h3>Department: "+Department+"</h3>");
    }
}
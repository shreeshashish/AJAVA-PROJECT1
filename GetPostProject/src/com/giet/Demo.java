package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Demo extends HttpServlet {
    public void doGet(HttpServletRequest rq, HttpServletResponse response)
            throws ServletException, IOException
    {
        String c = rq.getParameter("celsius");
        double celsius = Double.parseDouble(c);
        double fahrenheit = (celsius * 9 / 5) + 32;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Temperature Conversion</h2>");
        out.println("<p>Celsius: " + celsius + "</p>");
        out.println("<p>Fahrenheit: " + fahrenheit + "</p>");
    }
}
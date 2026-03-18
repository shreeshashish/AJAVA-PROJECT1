// multiplication of two number
package com.giet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class multiplication extends HttpServlet {
    public void doPost(HttpServletRequest rq, HttpServletResponse response) throws ServletException, IOException {
        int first = Integer.parseInt(rq.getParameter("first"));
        int second = Integer.parseInt(rq.getParameter("second"));
        int result = first * second;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Result</h2>");
        out.println("Multiplication = " + result);
    }
}
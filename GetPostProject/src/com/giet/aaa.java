//package com.giet;
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

//public class aaa extends HttpServlet{
//    public void doGet(HttpServletRequest req,HttpServletResponse res)
//            throws IOException {
//        String name = req.getParameter("name");
//
//        res.setContentType("text/html");
//        PrintWriter pw=res.getWriter();
//
//        pw.println("<html");
//        pw.println("<head>");
//        pw.println("<title>Application</title>");
//        pw.println("</head>");
//        pw.println("<html");
//        pw.println("</body>");
//
//        pw.println("<form action='" + req.getContextPath()+ "/second'method='get'>");
//        pw.println("<input type='hidden' name='name' id='name' value='"+name+"'>'");
//
//        pw.println("city");
//        pw.println("<input type='text' name='city' required>");
//        pw.println("<br><br>");
//
//        pw.println("<button type='submit'>Next</button>");
//        pw.println("</form>");
//
//        pw.println("</body>");
//        pw.println("</html>");
//    }
//}

package com.giet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class aaa extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>aaa Servlet</h2>");
        out.println("<form action='bbb' method='get'>");
        out.println("<input type='submit' value='Begin'>");
        out.println("</form>");
    }
}
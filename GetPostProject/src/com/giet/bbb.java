//package com.giet;
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//public class bbb extends HttpServlet {
//    public void doGet(HttpServletRequest req,HttpServletResponse res)
//            throws IOException{
//        try {
//
//            String name = req.getParameter("name");
//            String city = req.getParameter("city");
//            System.out.println("Data Arrived");
//            System.out.println("name:");
//            System.out.println("City:");
//
//            res.setContentType("text/html");
//            PrintWriter pw= res.getWriter();
//
//            pw.println("Data saved<br>");
//            pw.println("name:" + name);
//            pw.println("city:" + city);
//            pw.println("<a href='/com.demo/third?name=" + name + "&city=" + city + "'>save</a>");
//            pw.println("</body>");
//            pw.println("</html>");
////        pw.println("<form action='/com.demo/in.html'>");
////        pw.println("<button type='submit'>ok</button>");
//
//
//        }catch(Exception e){
//            System.out.println(e);
//
//        }
//
//
//
//    }
//}

package com.giet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class bbb extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>ccc Servlet</h2>");
        out.println("<form action='ccc' method='post'>");
        out.println("Enter Name: <input type='text' name='username' required>");
        out.println("<br><br>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
    }
}
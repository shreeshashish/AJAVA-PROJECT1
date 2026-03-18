//package com.giet;
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//
//
//
//
//public class ccc extends HttpServlet {
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

public class ccc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>ccc Servlet</h2>");
        out.println("<h3>Welcome, " + name + "!</h3>");
    }
}
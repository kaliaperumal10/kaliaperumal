package Example;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//@WebServlet("*.do")
public class Hello extends HttpServlet{
  public void doGet(HttpServletRequest req,HttpServletResponse res)
                throws ServletException, IOException{
      res.setContentType("text/html");
      PrintWriter pw = res.getWriter();
      String name = req.getParameter("name");
      pw.println("<HTML>");
      pw.println("<HEAD><TITLE>Hello "+name+"</TITLE></HEAD>");
      pw.println("<BODY>");
      pw.println("<H1>Hello, <BLINK>"+name+"</BLINK></H1>");
      pw.println("</BODY>");
      pw.println("</HTML>");    } 
  public  void doPost(HttpServletRequest req,HttpServletResponse res)
          throws ServletException, IOException{
doGet( req , res);
}   
}

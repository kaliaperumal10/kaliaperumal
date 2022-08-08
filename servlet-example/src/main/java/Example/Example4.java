package Example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("*.do")
public class Example4 extends HttpServlet {
    Connection con;
    PreparedStatement st;
    public void init(ServletConfig config) throws ServletException 
    {
        try
         {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
           st = con.prepareStatement("Insert into emp values(?,?)");
           System.out.println(con.prepareStatement("select * from emp"));
          
           }           catch( Exception e)
           { }     }
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException    {
        // first, set the "content type" header of the response
        String s1 = req.getParameter("name");
        String s2 = req.getParameter("age");
       res.setContentType("text/html");
       PrintWriter pw = res.getWriter();
       pw.println("<H1> Inserting Record:  </H1>");
       int x = Integer.parseInt(s2);
         try {
            st.setString(1,s1);
            st.setInt(2,x);
            st.executeUpdate();
           }catch(Exception e) { }
          pw.println("<h2> BYE  </h2>");
        } }

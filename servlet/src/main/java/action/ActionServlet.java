package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("*.do")
//@WebInitParam(name="driver",value="mysql driver...")
@WebServlet(
		//urlPatterns = "*.do",
		initParams = {
				@WebInitParam(name="driver",value="my sql driver...."),
				@WebInitParam(name="url",value="my sql driver urlllllll....")
				}
	)
public class ActionServlet extends HttpServlet {
      
   
	@Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("init called....");
    	String mydrivervalue=config.getInitParameter("driver");
    	System.out.println(mydrivervalue);
    	System.out.println(config.getInitParameter("url"));
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(name.equals("ramu")) {
			out.println("<h1>Welcome page.........................</h1>");
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
			rd.forward(request, response);
			//response.sendRedirect("Welcome.html");
		}
		System.out.println("Service method called...");
	}
	@Override
	public void destroy() {
		System.out.println("destroy called.....");
	}
}

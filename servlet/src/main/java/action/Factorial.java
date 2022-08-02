package action;

import java.io.PrintWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class Factorial extends TagSupport{
	
	@Override
	public int doEndTag() throws JspException {
		int n=Integer.parseInt(number);
		int i,fact=1;
		JspWriter out=pageContext.getOut();
		 for(i=1;i<=n;i++){    
		      fact=fact*i;   
		   //   out.println(fact);
		  }
		 try {
		out.println(fact);
		 }catch(Exception e) {}
		 return super.doEndTag();
	}
	String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}	

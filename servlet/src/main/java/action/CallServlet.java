package action;

import java.net.URL;
import java.net.URLConnection;

public class CallServlet {

	public static void main(String[] args) throws Exception {
URL url=new URL("http://localhost:8080/servlet/kali");
URLConnection urlcon=url.openConnection();
urlcon.getInputStream();
	}

}

package JDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
		System.out.println(con);
		String sql="update users set flag=?  where amount=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setInt(1,0);	//1-condition 4-flag
		stmt.setInt(2,1122);//2-condition 1500-amount
		int noofrowschanged=stmt.executeUpdate();
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}

}

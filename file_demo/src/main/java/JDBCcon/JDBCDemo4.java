package JDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo4 {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anoud","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from users";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		
		
		while(rs.next()) {
			System.out.println(rs.getInt("uid")+":"+rs.getString("uname"));
		}
	}
}
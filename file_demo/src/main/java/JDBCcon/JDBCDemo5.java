package JDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo5 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","root");
		String sql="select * from users where uname=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(1, "arun");
		ResultSet rs=stmt.executeQuery();
		
		//step 4 - process result
	
		if(rs.next()) {
			System.out.println(rs.getInt("uid")+":"+rs.getString("uname")+":"+rs.getInt("amount"));
		}}}
	


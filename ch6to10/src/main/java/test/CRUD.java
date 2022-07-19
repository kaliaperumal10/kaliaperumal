package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "root");
		int R;
		Statement stmt = con.createStatement();
   		String sql = "CREATE TABLE std1 " + "(rollno INTEGER not NULL, " +"name VARCHAR(255), " + " address VARCHAR(255), " + "section VARCHAR(255))"; 
		stmt.executeUpdate(sql);
		System.out.println("Created table in given database...");
		
		//Insert
		String sql1 = "INSERT INTO Std1 (rollno, name, address,section) VALUES (?, ?, ?, ?)";
		PreparedStatement statement1 = con.prepareStatement(sql1);
		
		statement1.setInt(1, 1);
		statement1.setString(2, "lion");
		statement1.setString(3, "fort");
		statement1.setString(4, "12-a");
		System.out.println(statement1);
		R = statement1.executeUpdate(
				"INSERT INTO Std1 VALUES (5, 'Raja', 'lenin st', '10-a')");
		System.out.println(R);
		System.out.println("A new user was inserted successfully!");
		
		//Update std1 record
		R = statement1.executeUpdate("Update std1 set section='6-b' where name='lion'");
		System.out.println(R);
		System.out.println("Update successfully!");

		// delete std1 record
		R = statement1.executeUpdate("delete from std1 where address = 'eion'");
		System.out.println(R);
		System.out.println("Deleted successfully...");
		
		// read std1 records
		ResultSet rs = statement1.executeQuery("Select * from std1");
		while (rs.next()) {
			System.out.println("rollno : " + rs.getInt("rollno") + ", name : " + rs.getString("name") + ", address : "
					+ rs.getString("address") + ", section : " + rs.getString("section"));
		}
		System.out.println("showed success");
	}

}

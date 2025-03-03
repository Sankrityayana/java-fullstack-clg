package mysql4;

import java.sql.*;

public class MySQL {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uni", "root", "root@123");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from employee");
			while(rs.next())
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

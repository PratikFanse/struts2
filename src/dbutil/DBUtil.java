package dbutil;

import java.sql.*;

public class DBUtil {
	public static Connection getCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/strutsapp","root","admin");
			System.out.println("success");
		}
		catch(Exception e){
			System.out.println("failed");

			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con) {
		try{con.close();}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
}


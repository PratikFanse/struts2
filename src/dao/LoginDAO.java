package dao;

import java.sql.*;

import dbutil.DBUtil;
import pojo.LoginInfo;

public class LoginDAO {
	
	public static boolean isUserValid(LoginInfo userDetails) {
		boolean validStatus= false;
		try {
			Connection con = DBUtil.getCon();
			Statement st = con.createStatement();
			ResultSet rs=  st.executeQuery("select * from log_info where user_name ='"+userDetails.getUserName()+"' and password='"+userDetails.getPassword()+"'");
			while(rs.next()) {
				validStatus = true;
			}
			DBUtil.closeConnection(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return validStatus;
	}

}

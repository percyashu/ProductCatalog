package com.signUp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dbconnection.Dbconnection;
import com.users.Users;


public class SignUpService {
	
	public static boolean signUp(Users users) {
	String name=users.getName();
	String username=users.getUsername();
	String password=users.getPassword();
	ResultSet rs = null;
	try {
		Connection con=Dbconnection.getConnection(); //getting the connection method here from dbconnection
		String sql = "insert into usertbl"
                +"(Name, Username, Password)"
                +"values(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,username);
		ps.setString(3,password);
		 ps.executeUpdate();
		 return true;
    
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return false;
 }
}


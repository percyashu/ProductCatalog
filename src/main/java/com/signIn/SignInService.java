package com.signIn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dbconnection.Dbconnection;
import com.users.Users;


public class SignInService {
	
	public static boolean login(Users users) {
	String username=users.getUsername();
	String password=users.getPassword();
	ResultSet rs = null;
	try {
		Connection con=Dbconnection.getConnection(); //getting the connection method here from dbconnection
		PreparedStatement ps = con.prepareStatement("select * from usertbl where Username='"+username+"' and Password='"+password+"';");
		rs=ps.executeQuery();
		 while(rs.next()){
             username = rs.getString("username");
             password = rs.getString("password");

             if(username.equals(username) && password.equals(password)){
                 System.out.println("OK");
                 return true;
             }
             System.out.println(username + password + " " + username + password);
         }
    
    
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return false;
 }
}


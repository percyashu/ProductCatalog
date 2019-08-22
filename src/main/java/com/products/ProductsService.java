package com.products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.dbconnection.Dbconnection;
import com.mysql.jdbc.Statement;





public class ProductsService {

	public static Products listP() {
		ResultSet rs = null;
		Products prod =null;
		java.sql.Statement stmt = null; 
		try {
			Connection con=Dbconnection.getConnection(); //getting the connection method here from dbconnection

String sql ="SELECT * FROM producttbl ;";
stmt = con.createStatement();

			rs=stmt.executeQuery(sql);
			while(rs.next()){
		         Products product = new Products (rs);
		         product.setPiD(rs.getString("PiD"));
		         product.setPname(rs.getString("Pname"));
		         product.setCname(rs.getString("Cname"));
		         product.setPimage(rs.getBlob("Pimage"));

		         System.out.println("products"+ product);
	         
	         }

	     } catch (SQLException e) {
	        System.out.println(e);
	     }
		
		return prod;
		
	}

}

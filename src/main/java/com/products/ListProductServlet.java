package com.products;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbconnection.Dbconnection;
@WebServlet(urlPatterns ="/listProduct.do")
public class ListProductServlet extends HttpServlet{

	private List<Products> products= new ArrayList<Products>();
	private ProductsService prodSer= new ProductsService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			prodSer.clearProds();
		
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("Select * From producttbl;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int Pid =rs.getInt(1);
				String Pname=rs.getString(2);
				String Cname=rs.getString(3);
				byte[] image=rs.getBytes(4);

				System.out.println("contacts "+Pname+" descript "+Cname+" descript "+image);
				String encode = Base64.getEncoder().encodeToString(image);
				prodSer.addProducts(new Products(Pid,Pname,Cname,image,encode));
			}
		}catch (SQLException e) {
			System.out.println(e);
			
		}

	request.getSession().removeAttribute("products");
	response.sendRedirect("/products.do");
}
}

package com.products;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.catalog.Catalog;
import com.dbconnection.Dbconnection;

@WebServlet(urlPatterns = "/addProduct.do")
@MultipartConfig(maxFileSize = 16177215)
public class addProdServlet extends HttpServlet {
	private ProductsService prodSer = new ProductsService();
private Connection con;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pname=request.getParameter("pname"); 
		String cname=request.getParameter("cname");
		InputStream inputStream = null;
		Part filePart = request.getPart("photo");
		 if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	        }

		try {
			
			 con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("INSERT INTO producttbl(PiD,Pname,Cname,Pimage)  VALUES (?,?,?,?);");
			ps.setInt(1,prodSer.sizeProds()+1);
			ps.setString(2, pname);
			ps.setString(3, cname);
			if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(4, inputStream);
            }
			ps.executeUpdate();
		  }
	catch (SQLException ex) {
            
            ex.printStackTrace();
	}
            response.sendRedirect("/listProduct.do");
		
}
		
		}
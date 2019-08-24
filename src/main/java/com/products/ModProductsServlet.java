package com.products;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.catalog.Catalog;
import com.dbconnection.Dbconnection;
@WebServlet(urlPatterns="/modProduct.do")
@MultipartConfig(maxFileSize = 16177215)
public class ModProductsServlet extends HttpServlet{
 private  String s ;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		s=request.getParameter("pid");
		request.getRequestDispatcher("/WEB-INF/views/modProduct.jsp").forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String ppname=request.getParameter("ppname");  String ccname=request.getParameter("ccname");
		int i =Integer.parseInt(s);
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

		if(ccname!=null&&ccname!=""&&ppname!=null&&ppname!="") {
		try {
			
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("UPDATE producttbl SET PiD ='"+i+"', Pname='"+ppname+"',Cname='"+ccname+"',Pimage=? WHERE PiD='"+i+"';");
			  ps.setBlob(1, inputStream);
			ps.executeUpdate();
			  
		
			
		}catch (SQLException e) {
			System.out.println(e);
			
		}
		response.sendRedirect("/listProduct.do");
		
		}
		else {
			response.sendRedirect("/listProduct.do");
		}
		}
}

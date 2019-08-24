package com.products;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalog.Catalog;
import com.catalog.CatalogService;
import com.dbconnection.Dbconnection;
@WebServlet(urlPatterns="/deleteProduct.do")
public class DeleteProductServlet extends HttpServlet {
	private ProductsService prodSer=new ProductsService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String pid=request.getParameter("pid");
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("Delete  From producttbl where PiD='"+pid+"';");
			  
			ps.executeUpdate();
			  
			
				prodSer.delProds();
		
		}catch (SQLException e) {
			System.out.println(e);
			
		}

		response.sendRedirect("/listProduct.do");
	}

}

package com.catalog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.Dbconnection;

@WebServlet(urlPatterns = "/deleteCatalog.do")
public  class DeleteCatalogServlet extends HttpServlet {

 private CatalogService catSer = new CatalogService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String cname=request.getParameter("cname");  String cdescript=request.getParameter("cdescript");
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("Delete  From categorytbl where Cname='"+cname+"' and Cdescript='"+cdescript+"';");
			  
			ps.executeUpdate();
			  
			//while(rs.next()) {
				System.out.println(" to be del contacts "+cname+" descript "+cdescript);
				catSer.deleteCatalog(new Catalog(cname,cdescript));
			//}
		}catch (SQLException e) {
			System.out.println(e);
			
		}

		response.sendRedirect("/listCatalog.do");
	}
}
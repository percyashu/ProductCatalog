package com.catalog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbconnection.Dbconnection;
@WebServlet (urlPatterns = "/addCatalog.do")
public class AddCatalogServlet extends HttpServlet {
	private CatalogService catSer = new CatalogService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cname=request.getParameter("ccname");  String cdescript=request.getParameter("ccdescript");
		if(cname!=null&&cname!=""&&cdescript!=null&&cdescript!="") {
		try {
			
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("INSERT INTO categorytbl(Cname, Cdescript)  VALUES (?,?);");
			ps.setString(1, cname);
			ps.setString(2,cdescript);
			ps.executeUpdate();
			  
				System.out.println(" to be added contacts "+cname+" descript "+cdescript);
				catSer.addCat(new Catalog(cname,cdescript));
			
		}catch (SQLException e) {
			System.out.println(e);
			
		}
		
		response.sendRedirect("/listCatalog.do");
		}else {
		response.sendRedirect("/listCatalog.do");
		}
			}
}

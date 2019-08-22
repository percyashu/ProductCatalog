package com.catalog;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbconnection.Dbconnection;
@WebServlet(urlPatterns ="/listCatalog.do")
public class ListAddServlet extends HttpServlet{

	private List<Catalog> catalogs= new ArrayList<Catalog>();
	private CatalogService catSer= new CatalogService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			catSer.clearCat();
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("Select * From categorytbl;");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String Cname =rs.getString(1);
				String Cdescript=rs.getString(2);
				System.out.println("contacts "+Cname+" descript "+Cdescript);
				catSer.addCat(new Catalog(Cname,Cdescript));
			}
		}catch (SQLException e) {
			System.out.println(e);
			
		}

	request.getSession().removeAttribute("catalogs");
	response.sendRedirect("/catalog.do");
}
}

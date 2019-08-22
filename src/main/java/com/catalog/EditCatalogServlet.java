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
@WebServlet(urlPatterns = "/editCatalog.do")
public class EditCatalogServlet extends HttpServlet{
	private CatalogService catSer = new CatalogService();
	private String cname;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cname=request.getParameter("cname");
		System.out.print("cname "+cname);
		request.setAttribute("cpname", cname);
	
		request.getRequestDispatcher("/WEB-INF/views/editcatalog.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String ccname=request.getParameter("ccname");  String ccdescript=request.getParameter("ccdescript");
		if(ccname!=null&&ccname!=""&&ccdescript!=null&&ccdescript!="") {
		try {
			
			 Connection con=Dbconnection.getConnection();
			PreparedStatement ps= con.prepareStatement("UPDATE categorytbl SET Cname='"+ccname+"',Cdescript='"+ccdescript+"' WHERE Cname='"+cname+"';");
			ps.executeUpdate();
			  
			
				System.out.println(" to be edited to  contacts "+ccname+" descript "+ccdescript);
				catSer.addCat(new Catalog(ccname,ccdescript));
			
		}catch (SQLException e) {
			System.out.println(e);
			
		}
		response.sendRedirect("/listCatalog.do");
		
		}
		else {
			response.sendRedirect("/listCatalog.do");
		}
		}
}

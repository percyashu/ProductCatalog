package com.catalog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns ="/catalog.do")
public class CatalogServlet extends HttpServlet{
	private  CatalogService catSer= new CatalogService();
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		
		request.setAttribute("catalogs",catSer.retrieveCatalogs());
	request.getRequestDispatcher("/WEB-INF/views/catalog.jsp").forward(request, response);	
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	response.sendRedirect("catalog.do");	
	}

}


package com.home;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.catalog.Catalog;
import com.catalog.CatalogService;
import com.dbconnection.Dbconnection;
import com.products.Products;
import com.products.ProductsService;
@WebServlet(urlPatterns ="/home.do")
public class HomeServlet extends HttpServlet {
	private CatalogService catSer= new CatalogService();
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
	
	request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);	
	}

}

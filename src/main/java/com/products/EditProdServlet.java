package com.products;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


import com.dbconnection.Dbconnection;

@WebServlet (urlPatterns = "/editProduct.do")
public class  EditProdServlet extends HttpServlet {
	private ProductsService prodSer = new ProductsService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setAttribute("products",prodSer.retrieveProducts());
	request.getRequestDispatcher("/WEB-INF/views/editproducts.jsp").forward(request, response);	
}
	

		

}

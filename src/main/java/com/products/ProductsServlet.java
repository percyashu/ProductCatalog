package com.products;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/products.do")
public class ProductsServlet extends HttpServlet{
	private ProductsService prodSer = new ProductsService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("products",prodSer.retrieveProducts());
		request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);	
	}
	}

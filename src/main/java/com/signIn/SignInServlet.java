package com.signIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.users.Users;
@WebServlet(urlPatterns ="/signIn.do")
public class SignInServlet extends HttpServlet {
	
	private SignInService userValidationService = new SignInService();
	
protected void doGet(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException  {
	request.getRequestDispatcher("/WEB-INF/views/signIn.jsp").forward(request, response);
	
}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		boolean valid = SignInService.login(user);
		if (valid) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect("/listProduct.do");
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!! SignUp ");
			request.getRequestDispatcher("/WEB-INF/views/signIn.jsp").forward(request, response);
		}
		
	}
	
}

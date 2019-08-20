package com.signUp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.users.Users;
@WebServlet(urlPatterns ="/signUp.do")
public class SignUpServlet extends HttpServlet {
	
	
protected void doGet(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException  {
	request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
	
}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String compassword= request.getParameter("cpassword");
		if(compassword.equals(password)) {
		Users user = new Users();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		boolean add = SignUpService.signUp(user);
		if (add) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect("/home.do");
		} else{
			request.setAttribute("errorMessage", "Error occured");
			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
		}
		}
		else{
			request.setAttribute("errorMessage", "Different passwords!!");
			request.getRequestDispatcher("/WEB-INF/views/signUp.jsp").forward(request, response);
		}
	}
	
}

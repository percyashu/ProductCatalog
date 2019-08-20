package webapp.signIn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns ="/signIn.do")
public class SignInServlet extends HttpServlet {
	
	private SignInService userValidationService = new SignInService();
	
protected void doGet(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException  {
	request.getRequestDispatcher("/WEB-INF/views/signIn.jsp").forward(request, response);
	
}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
	}
	
}

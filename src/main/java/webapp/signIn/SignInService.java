package webapp.signIn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SignInService {
	private static List<Users> users = new ArrayList();
	
	static {
		users.add(new Users("Perc","Ashu","qwerty"));
		
	}
	public void addUser(Users user) {
		users.add(user);
	}
	

}

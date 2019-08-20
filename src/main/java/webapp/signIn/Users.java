package webapp.signIn;

public class Users {

	private String username;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String password;
	
	public Users(String name,String username,  String password) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("Users [username=%s, name=%s, password=%s]", username, name, password);
	}
	
}

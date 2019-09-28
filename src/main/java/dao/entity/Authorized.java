package dao.entity;

public class Authorized {

	private String username;
	private String password;
	
	public Authorized(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Authorized() {
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

}

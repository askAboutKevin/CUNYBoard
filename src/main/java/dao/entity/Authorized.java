package dao.entity;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

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
	
	@ColumnName("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ColumnName("password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

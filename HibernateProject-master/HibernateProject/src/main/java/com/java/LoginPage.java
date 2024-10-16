package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginPage {
	private String username;
	private String password;

	public LoginPage() {
		super();
		// TODO Auto-generated constructor stub
	}
    @Id
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
		return "LoginPage [username=" + username + ", password=" + password + "]";
	}

}

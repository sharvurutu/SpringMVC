package com.spring.model;


public class User {
	private String userName;
	private String passsword;
	
	public User() {
		
	}
	
	public User(String userName, String password) {
		userName = this.userName;
		password = this.passsword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
}

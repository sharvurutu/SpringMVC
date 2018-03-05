package com.spring.service;

import org.springframework.stereotype.Service;

public class LoginService {
	
	public boolean verifyLogin(String userName, String password) {
		return userName.equalsIgnoreCase("admin") && password.equals("admin");
	}
}

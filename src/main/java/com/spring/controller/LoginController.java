package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.LoginService;

@Controller
public class LoginController {

//	@Autowired
	private LoginService loginService = new LoginService();
	
	@GetMapping("/login")
	public String processShowLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String processLogin(@RequestParam("userName") String userName, @RequestParam("password") String password, Model model) {
		if(loginService.verifyLogin(userName, password)) {	
			model.addAttribute("userName", userName);
			return "userhome";
		}
		return "errorlogin";
	}
}

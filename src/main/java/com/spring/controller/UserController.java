package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/logout") 
	public String processShowUserHome() {
		return "redirect:/";
	}
}

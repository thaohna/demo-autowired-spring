package com.anhthao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.anhthao.models.User;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@Autowired
	User user;
	
	@ModelAttribute("user")
	public User getUser() {
		return user;
	}
}

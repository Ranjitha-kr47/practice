package com.theteam.groceryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@CrossOrigin("http://localhost:4200")
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
//	@GetMapping("/")
//	public String home() {
//		return "index";
//	}
	
//	@GetMapping("/redirect")
//	RedirectView callRedirect(){
//	    return new RedirectView("https://www.google.com/redirect");
//	}
}

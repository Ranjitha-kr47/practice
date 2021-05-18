package com.theteam.groceryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.theteam.groceryapp.dao.UserRegistrationDao;
import com.theteam.groceryapp.service.UserServiceImpl;


@Controller
@RequestMapping("/registration")
@CrossOrigin("http://localhost:4200")
public class UserRegistrationController {

	private UserServiceImpl userService;

	public UserRegistrationController(UserServiceImpl userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDao userRegistration() {
        return new UserRegistrationDao();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDao registration) {
		userService.save(registration);
		return "redirect:/registration?success";
	}
}

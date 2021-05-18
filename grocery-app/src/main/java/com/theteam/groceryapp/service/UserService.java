package com.theteam.groceryapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.theteam.groceryapp.dao.UserRegistrationDao;
import com.theteam.groceryapp.entity.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDao registration);
}
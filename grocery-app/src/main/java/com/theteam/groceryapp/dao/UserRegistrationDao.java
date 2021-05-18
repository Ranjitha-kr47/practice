package com.theteam.groceryapp.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegistrationDao{
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
}
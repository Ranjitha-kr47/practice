package com.theteam.groceryapp.repository;

import java.util.Collection;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.theteam.groceryapp.entity.User;

@CrossOrigin("http://localhost:4200")
public interface UserRepository extends JpaRepository<User,Long>{
	User findByEmail(String email);
	
}

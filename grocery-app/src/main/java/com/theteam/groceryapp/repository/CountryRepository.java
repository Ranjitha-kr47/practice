package com.theteam.groceryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.theteam.groceryapp.entity.Country;
import com.theteam.groceryapp.entity.User;


@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
@CrossOrigin("http://localhost:4200")
public interface CountryRepository extends JpaRepository<Country, Long>{
	
	//User findByUserEmail(String theEmail);
}


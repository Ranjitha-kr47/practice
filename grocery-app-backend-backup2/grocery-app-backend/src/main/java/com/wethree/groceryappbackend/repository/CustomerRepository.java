package com.wethree.groceryappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wethree.groceryappbackend.entity.Customer;

@CrossOrigin(origins="http://localhost:4200")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}

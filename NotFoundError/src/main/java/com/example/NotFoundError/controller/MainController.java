package com.example.NotFoundError.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.NotFoundError.Entity.Customer;
import com.example.NotFoundError.service.CustomerService;

@RestController
public class MainController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int id)
	{
		return service.getUserById(id);
	}
	
	@PostMapping("customer/add")
	public Customer addCustomer()
	{
		Customer customer=new Customer("Muthuraj", "r", "muthuraj@gmail.co");
		return service.addCustomer(customer);
	}
}

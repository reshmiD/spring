package com.mycode.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@GetMapping(value="/list", produces="application/json")
	public List<Customer> getCustomerList(){
		return custService.loadAll();
	}
	@PostMapping(value="/save", consumes="application/json")
	public String saveCustomer(@RequestBody Customer customer){
		custService.save(customer);
		return customer.getName()+" saved successfully!";
	}
}

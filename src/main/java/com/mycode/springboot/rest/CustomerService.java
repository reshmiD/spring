package com.mycode.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer cust){
		customerRepository.save(cust);
	}
	
	public Customer load(Long custID){
		return customerRepository.findById(custID).get();
	}
	
	public List<Customer> loadAll(){
		return customerRepository.findAll();
	}
}

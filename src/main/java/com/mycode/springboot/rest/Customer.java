package com.mycode.springboot.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custID;
	
	private String name;
	private int phoneNo;
	private String country;
	
	public Customer(){
		
	}
	public Customer(String name, int phone, String country){
		this.name=name;
		this.phoneNo=phone;
		this.country=country;
	}
	public Long getCustID() {
		return custID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}

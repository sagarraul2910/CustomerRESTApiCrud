package com.CustomerRESTApiCrud.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.CustomerRESTApiCrud.model.Customer;

public interface CustomerService  {
	
	List<Customer> getAllCustomers();
	
	public Customer saveCustomer(Customer customer);
	
	public ResponseEntity<Customer> getCustomerById(Long customerid);
	
	public String updateCustomer(Customer customer,long customerid);
	
	public String deleteCustomer(long customerid);
	
	void deleteAllCustomer();

	

}

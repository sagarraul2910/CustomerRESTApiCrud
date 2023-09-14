package com.CustomerRESTApiCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerRESTApiCrud.model.Customer;
import com.CustomerRESTApiCrud.repository.CustomerRepository;
import com.CustomerRESTApiCrud.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return customerServiceImpl.getAllCustomers();
	}
	
	@GetMapping("/customers/{customerid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable long customerid)
	{
		return customerServiceImpl.getCustomerById(customerid);
	}
	
	
	@PostMapping("/customers")
	public String createCustomer(@RequestBody Customer customer)
	{
		 customerServiceImpl.saveCustomer(customer);
		 return "Customer created...";
	}
	
	@PutMapping("/customers/{customerid}")
	public String updateCustomer(@PathVariable long customerid,@RequestBody Customer customer)
	{
		customerServiceImpl.updateCustomer(customer,customerid);
		return "Customer updated..";
	}
	
	@DeleteMapping("/customers/{customerid}")
	public String deleteCustomerById(@PathVariable long customerid)
	{
		customerServiceImpl.deleteCustomer(customerid);
		return "Customer deleted......";
	}
	
	
	
	@DeleteMapping("/customers")
	public String deleteCustomerById()
	{
		customerServiceImpl.deleteAllCustomer();
		return "Customer deleted......";
	}
	
}












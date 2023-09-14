package com.CustomerRESTApiCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CustomerRESTApiCrud.model.Customer;
import com.CustomerRESTApiCrud.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public ResponseEntity<Customer> getCustomerById(Long customerid) {
		
		Optional<Customer> customer=customerRepository.findById(customerid);
		if(customer.isPresent())
		{
			 return new ResponseEntity<Customer>(customer.get(),HttpStatus.FOUND);
		}
		else
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
		
	}

	@Override
	public String updateCustomer(Customer customer, long customerid) {
		
		Optional<Customer> cust= customerRepository.findById(customerid);
		
		if(cust.isPresent())
		{
			Customer existingCustomer=cust.get();
			existingCustomer.setCustomer_name(customer.getCustomer_name());
			existingCustomer.setCustomer_emailId(customer.getCustomer_emailId());
			existingCustomer.setCustomer_age(customer.getCustomer_age());
			//existingCustomer.setAddress(customer.getAddress());
		
			customerRepository.save(existingCustomer);
			
			return "Customer details for "+customerid+" updated";
		}
		else
		{
			return "Customer details not exist for Customer ID "+customerid;
		}
		
	}

	@Override
	public String deleteCustomer(long customerid) {
		
		Optional<Customer> cust=customerRepository.findById(customerid);
		
		if(cust.isPresent())
		{
			customerRepository.deleteById(customerid);
			return "Customer details for "+customerid+" deleted...";
		}
		else
		{
			return "Customer details not exist for Customer ID "+customerid;
		}
		
	}

	@Override
	public void deleteAllCustomer() {

		customerRepository.deleteAll();
	}

}

package com.CustomerRESTApiCrud.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer_table")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;
	private String customer_name;
	private String customer_emailId;
	private Integer customer_age;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_address_id")
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_customer_id",referencedColumnName = "customer_id")
	
	//private Address  address;
	
	public Customer() {

	}
	
	
	
	public Customer(Long customer_id, String customer_name, String customer_emailId, Integer customer_age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_emailId = customer_emailId;
		this.customer_age = customer_age;
		//this.address = address;
	}



	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_emailId() {
		return customer_emailId;
	}
	public void setCustomer_emailId(String customer_emailId) {
		this.customer_emailId = customer_emailId;
	}
	public Integer getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(Integer customer_age) {
		this.customer_age = customer_age;
	}
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	
	
	
	
}

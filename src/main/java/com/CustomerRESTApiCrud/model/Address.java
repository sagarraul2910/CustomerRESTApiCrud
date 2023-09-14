/*
 * package com.CustomerRESTApiCrud.model;
 * 
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToOne;
 * import jakarta.persistence.OneToOne; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="address") public class Address {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long address_id;
 * private String city; private String address_type;
 * 
 * //@OneToOne(mappedBy = "address")
 * 
 * //@ManyToOne //@JoinColumn(name="cust_id") //private Customer customer;
 * 
 * public Address() {
 * 
 * }
 * 
 * 
 * public Address(Long address_id, String city, String address_type, Customer
 * customer) { super(); this.address_id = address_id; this.city = city;
 * this.address_type = address_type; this.customer = customer; }
 * 
 * 
 * public Long getAddress_id() { return address_id; } public void
 * setAddress_id(Long address_id) { this.address_id = address_id; } public
 * String getCity() { return city; } public void setCity(String city) {
 * this.city = city; } public String getAddress_type() { return address_type; }
 * public void setAddress_type(String address_type) { this.address_type =
 * address_type; }
 * 
 * 
 * 
 * 
 * }
 */
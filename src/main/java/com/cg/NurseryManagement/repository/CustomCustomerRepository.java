package com.cg.NurseryManagement.repository;

import java.util.List;

import com.cg.NurseryManagement.entity.Customer;

public interface CustomCustomerRepository {
	public List<Customer> viewAllCustomers() ;
	public List<Customer> validateCustomer(String userName, String Password);
	public List<Customer> findById(Customer tenant);

}

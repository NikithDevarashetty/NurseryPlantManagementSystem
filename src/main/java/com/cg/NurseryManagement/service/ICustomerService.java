package com.cg.NurseryManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.entity.Customer;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Planter;
import com.cg.NurseryManagement.entity.Seed;
@Service
public interface ICustomerService {
	public boolean addCustomer(Customer customer);
	 public Customer updateCustomer(Customer tenant);
	 public boolean deleteCustomer(Customer tenant);
	 public Customer viewCustomer(int customerid);
	
	
	
		public List<Customer> viewAllCustomers() ;
		//public List<Customer> validateCustomer(String userName, String Password);
		//public Customer findById(int tenant);
}

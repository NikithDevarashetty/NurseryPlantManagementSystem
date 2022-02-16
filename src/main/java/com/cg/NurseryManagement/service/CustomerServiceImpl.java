package com.cg.NurseryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.entity.Customer;
import com.cg.NurseryManagement.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerRepository customerrepo;
    
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerrepo.save(customer);
		return true;
	}

	@Override
	public Customer updateCustomer(Customer tenant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomer(Customer tenant) {
		// TODO Auto-generated method stub
		Customer c=customerrepo.findById(tenant).get(0);
		customerrepo.delete(c);
		return false;
	}

	@Override
	public Customer viewCustomer(int customerid) {
		// TODO Auto-generated method stub
		return customerrepo.findById(customerid).get();
	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerrepo.findAll();
	}

	/*
	@Override
	public Customer findById(int tenant) {
		// TODO Auto-generated method stub
		return  customerrepo.findById(tenant).get();
	}
*/
}

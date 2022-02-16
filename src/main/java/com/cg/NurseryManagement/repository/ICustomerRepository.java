package com.cg.NurseryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.NurseryManagement.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer>, CustomCustomerRepository{

	

}

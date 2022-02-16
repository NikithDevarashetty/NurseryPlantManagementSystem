package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.CustomerBasicInfoDTO;
import com.cg.NurseryManagement.dto.CustomerSavePostDTO;
import com.cg.NurseryManagement.entity.Customer;



@Service
public interface IAdminService {

	Customer getCustomerInfo(int customerid);

	List<Customer> getCustomerList();

	CustomerBasicInfoDTO saveCustomer(@Valid CustomerSavePostDTO customer);

	boolean validateLogin(String username, String password);

}

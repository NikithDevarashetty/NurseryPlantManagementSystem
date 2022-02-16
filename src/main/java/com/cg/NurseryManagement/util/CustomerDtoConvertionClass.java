package com.cg.NurseryManagement.util;

import org.springframework.stereotype.Component;

import com.cg.NurseryManagement.dto.CustomerBasicInfoDTO;
import com.cg.NurseryManagement.dto.CustomerSavePostDTO;
import com.cg.NurseryManagement.entity.Customer;



@Component
public class CustomerDtoConvertionClass {
	public CustomerBasicInfoDTO getCustomerBasicInfoDTO(Customer customer) {
		CustomerBasicInfoDTO dtoObj=new CustomerBasicInfoDTO();
		dtoObj.setAddress(customer.getAddress());
		dtoObj.setCustomerEmail(customer.getCustomerEmail());
		dtoObj.setCustomerName(customer.getCustomerName());
		dtoObj.setUserId(customer.getUserId());
		return dtoObj;
}
	public Customer getCustomersFromPostCustomerDTO(CustomerSavePostDTO dto) {
		Customer c = new Customer();
		c.setAddress(dto.getAddress());
		c.setCustomerEmail(dto.getCustomerEmail());
		c.setCustomerName(dto.getCustomerName());
		c.setUserId(dto.getUserId());
		return c;
	}
	
}

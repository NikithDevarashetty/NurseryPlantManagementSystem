package com.cg.NurseryManagement.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.cg.NurseryManagement.entity.Address;

public class CustomerSavePostDTO {
	private Integer userId;
	private String customerName;
	private String customerEmail;
	private Address address;
	public CustomerSavePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerSavePostDTO(Integer userId, String customerName, String customerEmail, Address address) {
		super();
		this.userId = userId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.address = address;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}

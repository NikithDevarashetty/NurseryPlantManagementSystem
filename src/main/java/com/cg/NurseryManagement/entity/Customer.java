package com.cg.NurseryManagement.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	@Id
	private Integer userId;
	private String customerName;
	private String customerEmail;
	
	@Embedded
	private Address address;
}

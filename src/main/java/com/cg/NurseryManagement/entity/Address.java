package com.cg.NurseryManagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Embeddable
public class Address {
	
	private Integer addressId;
	@NotNull(message = "houseno Cannot be left Blank")
	private String houseNo;
	@NotNull(message = "colony Cannot be left Blank")
	private String colony;
	@NotNull(message = "city Cannot be left Blank")
	private String city;
	@NotNull(message = "state Cannot be left Blank")
	private String state;
	@NotNull(message = "pincode Cannot be left Blank")
	@Min(value = 6,message = "cannot be less than 6 digits")
	@Max(value=6,message="pincode cannot be greater than 6 digits")
	private int pincode;
}

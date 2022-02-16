package com.cg.NurseryManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User1 {
	@Id
	@SequenceGenerator(name="mylogic5",initialValue=10000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic5")
	int userId;
	
	String userRole;
	
	String userName;
	@NotNull(message = "password Cannot be left Blank !! ")
	//@Min(value = 8,message = "Min 8 characters should be there !!")
	@Size(min=8)
	String Password;

}

package com.cg.NurseryManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Combo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int comboid;
	private String choclateType;
	
	private double chocolateCost;
	private int plantId;
    private int planterId;
	private int seedId;
	
	
	

}
package com.cg.NurseryManagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Plant {
	@Id
	
	private Integer plantId;
	private Integer plantHeight;
	
	private String commonName;
	
	private String medicinalOrCulinaryUse;
	private String difficultyLevel;
	private int temparature;
	private String typeOfPlant;
	private String plantDescription;
	private Integer plantsStock;
	private double plantCost;
}

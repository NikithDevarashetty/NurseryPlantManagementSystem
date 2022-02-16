package com.cg.NurseryManagement.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Planter {
	@Id
	@SequenceGenerator(name="mylogic3",initialValue=1000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic3")
	
	private Integer planterId;
	@Min(value=5,message="height can't be lessthan 5cm")
	private float planterheight;
	private int planterCapacity;
	private int drinageHoles;
	private String planterColor;
	private String planterShape;
	private int planterStock;
	private double planterCost;
	
}

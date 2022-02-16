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
public class Seed {
	@Id
	@SequenceGenerator(name="mylogic2",initialValue=10000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic2")
	private Integer seedId;
	private String commonName;
	private String bloomTime;
	private String watering;
	private String difficultyLevel;
	private int temparature;
	private String typeOfSeeds;
	private String seedsDescription;
	private Integer seedsStock;
	private double seedsCost;
	private Integer seedsPerPacket;
}


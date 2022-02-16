package com.cg.NurseryManagement.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PlantSavePostDto {
	private Integer plantId;
	private Integer plantHeight;
	@NotNull(message="Common name cannot be Null")
	private String commonName;
	
	private String medicinalOrCulinaryUse;
	private String difficultyLevel;
	private int temparature;
	private String typeOfPlant;
	private String plantDescription;
	private Integer plantsStock;
	@Min(value=1,message="cost minimum greater than 1 rupee")
	private double plantCost;
	public PlantSavePostDto() {
		super();
	}
	public Integer getPlantId() {
		return plantId;
	}
	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}
	public Integer getPlantHeight() {
		return plantHeight;
	}
	public void setPlantHeight(Integer plantHeight) {
		this.plantHeight = plantHeight;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getMedicinalOrCulinaryUse() {
		return medicinalOrCulinaryUse;
	}
	public void setMedicinalOrCulinaryUse(String medicinalOrCulinaryUse) {
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public int getTemparature() {
		return temparature;
	}
	public void setTemparature(int temparature) {
		this.temparature = temparature;
	}
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	public String getPlantDescription() {
		return plantDescription;
	}
	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}
	public Integer getPlantsStock() {
		return plantsStock;
	}
	public void setPlantsStock(Integer plantsStock) {
		this.plantsStock = plantsStock;
	}
	public double getPlantCost() {
		return plantCost;
	}
	public void setPlantCost(double plantCost) {
		this.plantCost = plantCost;
	}
	public PlantSavePostDto(Integer plantId, Integer plantHeight,
			@NotNull(message = "Common name cannot be Null") String commonName, String medicinalOrCulinaryUse,
			String difficultyLevel, int temparature, String typeOfPlant, String plantDescription, Integer plantsStock,
			@Min(value = 1, message = "cost minimum greater than 1 rupee") double plantCost) {
		super();
		this.plantId = plantId;
		this.plantHeight = plantHeight;
		this.commonName = commonName;
		this.medicinalOrCulinaryUse = medicinalOrCulinaryUse;
		this.difficultyLevel = difficultyLevel;
		this.temparature = temparature;
		this.typeOfPlant = typeOfPlant;
		this.plantDescription = plantDescription;
		this.plantsStock = plantsStock;
		this.plantCost = plantCost;
	}

}

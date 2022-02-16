package com.cg.NurseryManagement.dto;

import javax.validation.constraints.Min;

public class PlanterSavePostDto {
	private Integer planterId;
	@Min(value=5,message="height can't be lessthan 5cm")
	private float planterheight;
	private int planterCapacity;
	private int drinageHoles;
	private String planterColor;
	private String planterShape;
	private int planterStock;
	private double planterCost;
	public PlanterSavePostDto() {
		super();
	}
	public Integer getPlanterId() {
		return planterId;
	}
	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}
	public float getPlanterheight() {
		return planterheight;
	}
	public void setPlanterheight(float planterheight) {
		this.planterheight = planterheight;
	}
	public int getPlanterCapacity() {
		return planterCapacity;
	}
	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}
	public int getDrinageHoles() {
		return drinageHoles;
	}
	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}
	public String getPlanterColor() {
		return planterColor;
	}
	public void setPlanterColor(String planterColor) {
		this.planterColor = planterColor;
	}
	public String getPlanterShape() {
		return planterShape;
	}
	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}
	public int getPlanterStock() {
		return planterStock;
	}
	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}
	public double getPlanterCost() {
		return planterCost;
	}
	public void setPlanterCost(double planterCost) {
		this.planterCost = planterCost;
	}
	public PlanterSavePostDto(Integer planterId,
			@Min(value = 5, message = "height can't be lessthan 5cm") float planterheight, int planterCapacity,
			int drinageHoles, String planterColor, String planterShape, int planterStock, double planterCost) {
		super();
		this.planterId = planterId;
		this.planterheight = planterheight;
		this.planterCapacity = planterCapacity;
		this.drinageHoles = drinageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
	}
	
	

}

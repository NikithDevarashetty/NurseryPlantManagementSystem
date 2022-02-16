package com.cg.NurseryManagement.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.NurseryManagement.entity.Plant;
@Repository
public interface CustomPlantRepository {
	public List<Plant> sortByPlantHeight();
	public List<Plant> sortByPlantCost();
	public List<Plant> sortByPlantTemp();
	public List<Plant> getPlantByTemperature(int temp1 , int temp2);
	
	public List<Plant> veiwAllPlantsbytype(String typeOfPlant);

}

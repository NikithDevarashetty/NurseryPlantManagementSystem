package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;
import com.cg.NurseryManagement.entity.Plant;
@Service
public interface IPlantService {
	public boolean addPlant(Plant plant);
	public Plant updatePlant(Plant plant);
	public boolean deletePlant(int ispn);
	public PlantBasicInfoDto savePlant(@Valid PlantSavePostDto plant);
	public Plant viewPlant(int plantId);
	public List<Plant> sortByPlantHeight();
	public List<Plant> sortByPlantCost();
	public List<Plant> sortByPlantTemp();
	public List<Plant> getAllPlants();
	public List<Plant> getPlantByTemperature(int temp1 , int temp2);
	//
	public boolean removePlant(int plantId);
}

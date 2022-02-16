package com.cg.NurseryManagement.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Seed;
import com.cg.NurseryManagement.repository.IPlantRepository;
import com.cg.NurseryManagement.util.PlantDtoConvertionClass;


@Service
public class PlantServiceImpl implements IPlantService {
	@Autowired
	IPlantRepository plantrepo;
	@Autowired
	PlantDtoConvertionClass dtoConvertion;
	@Override
	public boolean addPlant(Plant plant) {
		// TODO Auto-generated method stub
		plantrepo.save(plant);
		
		return true;
	}

	@Override
	public Plant updatePlant(Plant plant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlant(int ispn) {
		// TODO Auto-generated method stub
		Plant b=plantrepo.findById(ispn).get();
		plantrepo.delete(b);
		return false;
	}

	@Override
	public Plant viewPlant(@RequestParam int plantId) {
		// TODO Auto-generated method stub
		return plantrepo.findById(plantId).get();
	}

	

	@Override
	public List<Plant> getPlantByTemperature(int temp1, int temp2) {
		// TODO Auto-generated method stub
		List<Plant> plants=(List<Plant>) plantrepo.findAll();
		return plants.stream().filter((temp)->temp.getTemparature()>temp1).collect((Collectors.toList()));
		
	}

	@Override
	public List<Plant> sortByPlantHeight() {
		// TODO Auto-generated method stub
		return plantrepo.sortByPlantHeight();
	}

	@Override
	public List<Plant> sortByPlantCost() {
		// TODO Auto-generated method stub
		return plantrepo.sortByPlantCost();
	}

	@Override
	public List<Plant> sortByPlantTemp() {
		// TODO Auto-generated method stub
		return plantrepo.sortByPlantTemp();
	}
	@Override
	public List<Plant> getAllPlants() {
		List<Plant> list = (List<Plant>) plantrepo.findAll();
	     return list;
	}
	@Override 
	public PlantBasicInfoDto savePlant(@Valid PlantSavePostDto plantDTO) {
		Plant p=dtoConvertion.getPlantFromPostPlantDto(plantDTO);
		Plant savedObj=plantrepo.save(p);
		PlantBasicInfoDto dtoObj=dtoConvertion.getPlantBasicInfoDto(savedObj);
				return dtoObj;
		
	}

	@Override
	public boolean removePlant(int plantId) {
		// TODO Auto-generated method stub
		plantrepo.deleteById(plantId);
		return true;
		
	}

}

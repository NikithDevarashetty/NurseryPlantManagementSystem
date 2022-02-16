package com.cg.NurseryManagement.util;

import org.springframework.stereotype.Component;

import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;

import com.cg.NurseryManagement.entity.Plant;

@Component
public class PlantDtoConvertionClass {
	public PlantBasicInfoDto getPlantBasicInfoDto(Plant plant) {
		PlantBasicInfoDto dtoob = new PlantBasicInfoDto();
		dtoob.setPlantId(plant.getPlantId());
		dtoob.setCommonName(plant.getCommonName());
		dtoob.setDifficultyLevel(plant.getDifficultyLevel());
		dtoob.setMedicinalOrCulinaryUse(plant.getMedicinalOrCulinaryUse());
		dtoob.setPlantCost(plant.getPlantCost());
		dtoob.setPlantDescription(plant.getPlantDescription());
		dtoob.setPlantHeight(plant.getPlantHeight());
		dtoob.setPlantsStock(plant.getPlantsStock());
		dtoob.setTemparature(plant.getTemparature());
		dtoob.setTypeOfPlant(plant.getTypeOfPlant());
		return dtoob;
	}
	public Plant getPlantFromPostPlantDto(PlantSavePostDto dto) {
		Plant p = new Plant();
		p.setPlantId(dto.getPlantId());
		p.setCommonName(dto.getCommonName());
		p.setDifficultyLevel(dto.getDifficultyLevel());
		p.setMedicinalOrCulinaryUse(dto.getMedicinalOrCulinaryUse());
		p.setPlantCost(dto.getPlantCost());
		p.setPlantDescription(dto.getPlantDescription());
		p.setPlantHeight(dto.getPlantHeight());
		p.setPlantsStock(dto.getPlantsStock());
		p.setTemparature(dto.getTemparature());
		p.setTypeOfPlant(dto.getTypeOfPlant());
		return p;
		
	}
}

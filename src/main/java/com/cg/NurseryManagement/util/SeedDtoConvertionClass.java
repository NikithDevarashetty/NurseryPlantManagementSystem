package com.cg.NurseryManagement.util;


import org.springframework.stereotype.Component;

import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;
import com.cg.NurseryManagement.dto.SeedBasicInfoDto;
import com.cg.NurseryManagement.dto.SeedSavePostDto;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Seed;
@Component
public class SeedDtoConvertionClass {
	public SeedBasicInfoDto getSeedBasicInfoDto(Seed seed) {
		SeedBasicInfoDto dtooj = new SeedBasicInfoDto();
		dtooj.setBloomTime(seed.getBloomTime());
		dtooj.setCommonName(seed.getCommonName());
		dtooj.setDifficultyLevel(seed.getDifficultyLevel());
		dtooj.setSeedsCost(seed.getSeedsCost());
		dtooj.setSeedsDescription(seed.getSeedsDescription());
		dtooj.setSeedsPerPacket(seed.getSeedsPerPacket());
		dtooj.setSeedsStock(seed.getSeedsStock());
		dtooj.setTemparature(seed.getTemparature());
		dtooj.setTypeOfSeeds(seed.getTypeOfSeeds());
		dtooj.setWatering(seed.getWatering());
		dtooj.setSeedId(seed.getSeedId());
		return dtooj;
	}
	public Seed getSeedFromPostSeedDto(SeedSavePostDto dto) {
		Seed s = new Seed();
		s.setBloomTime(dto.getBloomTime());
		s.setCommonName(dto.getCommonName());
		s.setDifficultyLevel(dto.getDifficultyLevel());
		s.setSeedsCost(dto.getSeedsCost());
		s.setSeedsDescription(dto.getSeedsDescription());
		s.setSeedsPerPacket(dto.getSeedsPerPacket());
		s.setSeedsStock(dto.getSeedsStock());
		s.setTemparature(dto.getTemparature());
		s.setTypeOfSeeds(dto.getTypeOfSeeds());
		s.setWatering(dto.getWatering());
		s.setSeedId(dto.getSeedId());
		return s;
	}

}

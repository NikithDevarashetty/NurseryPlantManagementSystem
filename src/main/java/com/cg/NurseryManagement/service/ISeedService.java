package com.cg.NurseryManagement.service;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.SeedBasicInfoDto;
import com.cg.NurseryManagement.dto.SeedSavePostDto;
import com.cg.NurseryManagement.entity.Seed;

@Service
public interface ISeedService {
	public boolean addSeed(Seed seed);
	public Seed updateSeed(Seed seed);
	public boolean deleteSeed(int sid);
	public Seed viewSeed(int seedId);
	public List<Seed> getAllSeeds();
	public List<Seed> viewListBydifficultyLevel(String difficultyLevel);
	public List<Seed> sortBySeedCost();
	public List<Seed> sortBySeedTemp();
	public SeedBasicInfoDto saveSeed(@Valid SeedSavePostDto seed);
	public boolean removeSeed(int seedId);

}

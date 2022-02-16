package com.cg.NurseryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.SeedBasicInfoDto;
import com.cg.NurseryManagement.dto.SeedSavePostDto;
import com.cg.NurseryManagement.entity.Seed;

import com.cg.NurseryManagement.repository.ISeedRepository;
import com.cg.NurseryManagement.util.SeedDtoConvertionClass;
@Component
@Service
public class SeedServiceImpl implements ISeedService {
	@Autowired
	ISeedRepository seedrepo;
	@Autowired
	SeedDtoConvertionClass dtoConvertions;
	@Override
	public boolean addSeed(Seed seed) {
		// TODO Auto-generated method stub
		seedrepo.save(seed);
		return true;
		
	}
	@Override
	public SeedBasicInfoDto saveSeed( SeedSavePostDto seedDto) {
		// TODO Auto-generated method stub
		Seed se=dtoConvertions.getSeedFromPostSeedDto(seedDto);
		Seed saveObj=seedrepo.save(se);
		SeedBasicInfoDto dtoObj1=dtoConvertions.getSeedBasicInfoDto(saveObj);
		return dtoObj1;
	}

	@Override
	public Seed updateSeed(Seed seed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteSeed(int seedId) {
		// TODO Auto-generated method stub
		Seed pl=seedrepo.findById(seedId).get();
		seedrepo.delete(pl);
		return false;
		
	}

	@Override
	public Seed viewSeed(int seedId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seed> sortBySeedCost() {
		// TODO Auto-generated method stub
		return seedrepo.sortBySeedCost();
		
	}

	@Override
	public List<Seed> sortBySeedTemp() {
		// TODO Auto-generated method stub
		return seedrepo.sortBySeedTemp();
	}

	@Override
	public List<Seed> viewListBydifficultyLevel(String difficultyLevel) {
		// TODO Auto-generated method stub
		return seedrepo.viewListBydifficultyLevel(difficultyLevel);
	}

	@Override
	public List<Seed> getAllSeeds() {
		List<Seed> list = (List<Seed>) seedrepo.findAll();
	     return list;
	}
	@Override
	public boolean removeSeed(int seedId) {
	
		seedrepo.deleteById(seedId);
		return true;
	}

}

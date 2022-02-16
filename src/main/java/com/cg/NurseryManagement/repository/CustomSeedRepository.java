package com.cg.NurseryManagement.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.NurseryManagement.entity.Seed;
@Repository
public interface CustomSeedRepository {
	public List<Seed> sortBySeedCost();
	public List<Seed> sortBySeedTemp();
	public List<Seed> viewListBydifficultyLevel(String difficultyLevel);
	

}

package com.cg.NurseryManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cg.NurseryManagement.entity.Plant;


public interface IPlantRepository extends CrudRepository<Plant, Integer>,CustomPlantRepository {
	

}

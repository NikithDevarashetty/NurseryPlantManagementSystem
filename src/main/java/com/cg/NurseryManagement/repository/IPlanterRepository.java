package com.cg.NurseryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.NurseryManagement.entity.Planter;


public interface IPlanterRepository extends CrudRepository<Planter, Integer>,CustomPlanterRepository {

}

package com.cg.NurseryManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.cg.NurseryManagement.entity.Seed;


public interface ISeedRepository extends CrudRepository<Seed, Integer>,CustomSeedRepository{

}

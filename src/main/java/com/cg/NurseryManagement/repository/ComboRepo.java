package com.cg.NurseryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.NurseryManagement.entity.Combo;

public interface ComboRepo extends CrudRepository<Combo, Integer>, CustomComboRepo {

}

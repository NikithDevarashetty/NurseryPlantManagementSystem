package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlanterBasicInfoDto;
import com.cg.NurseryManagement.dto.PlanterSavePostDto;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Planter;
import com.cg.NurseryManagement.repository.IPlanterRepository;
import com.cg.NurseryManagement.util.PlantDtoConvertionClass;
import com.cg.NurseryManagement.util.PlanterDtoConvertionClass;


@Service
public class PlanterServiceImpl implements IPlanterService {
	@Autowired
	IPlanterRepository planterrepo;
	@Autowired
	PlanterDtoConvertionClass dtoConvertion;
	@Override
	public boolean addPlanter(Planter planter) {
		// TODO Auto-generated method stub
		planterrepo.save(planter);
		return true;
		
	}

	@Override
	public Planter updatePlanter(Planter planter) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean deletePlanter(int planter) {
		// TODO Auto-generated method stub
		Planter pl=planterrepo.findById(planter).get();
		planterrepo.delete(pl);
		return false;
		
	}

	@Override
	public Planter viewPlanter(int planterId) {
		// TODO Auto-generated method stub
		return planterrepo.findById(planterId).get();
		
	}

	@Override
	public List<Planter> sortByPlanterHeight() {
		// TODO Auto-generated method stub
		return planterrepo.sortByPlanterHeight();
	}

	@Override
	public List<Planter> sortByPlanterCost() {
		// TODO Auto-generated method stub
		return planterrepo.sortByPlanterCost();
		
	}

	@Override
	public List<Planter> sortByPlanterShape() {
		// TODO Auto-generated method stub
		return planterrepo.sortByPlanterShape();
		
	}

	@Override
	public List<Planter> sortByPlanterColor() {
		// TODO Auto-generated method stub
		return planterrepo.sortByPlanterColor();
		
	}

	@Override
	public List<Planter> getAllPlanters() {
		// TODO Auto-generated method stub
		List<Planter> list = (List<Planter>) planterrepo.findAll();
	     return list;
		
	}

	@Override
	public List<Planter> listByplanterShape(String planterShape) {
		// TODO Auto-generated method stub
		
		return planterrepo.listByplanterShape(planterShape);
	}

	@Override
	public PlanterBasicInfoDto savePlanter(@Valid PlanterSavePostDto planterDTO) {
		// TODO Auto-generated method stub
		Planter pl=dtoConvertion.getPlanterFromPostPlanterDto(planterDTO);
		Planter savedObj=planterrepo.save(pl);
		PlanterBasicInfoDto dtoObj=dtoConvertion.getPlanterBasicInfoDto(savedObj);
				return dtoObj;
		
	}
	@Override
	public boolean removePlanter(int planterId) {
		planterrepo.deleteById(planterId);
		return true;
	}

}

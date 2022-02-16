package com.cg.NurseryManagement.service;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;


import com.cg.NurseryManagement.dto.PlanterBasicInfoDto;
import com.cg.NurseryManagement.dto.PlanterSavePostDto;
import com.cg.NurseryManagement.entity.Planter;
@Service
public interface IPlanterService {
	public boolean addPlanter(Planter planter);
	public Planter updatePlanter(Planter planter);
	public boolean deletePlanter(int planter);
	public List<Planter> getAllPlanters();
	public PlanterBasicInfoDto savePlanter(@Valid PlanterSavePostDto planter);
	public Planter viewPlanter(int planterId);
	public List<Planter> sortByPlanterHeight();
	public List<Planter> sortByPlanterCost();
	public List<Planter> sortByPlanterShape();
	public List<Planter> sortByPlanterColor();
	public List<Planter> listByplanterShape(String planterShape);
	public boolean removePlanter(int planterId);

}

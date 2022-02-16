package com.cg.NurseryManagement.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.NurseryManagement.entity.Planter;
@Repository
public interface CustomPlanterRepository {
	public List<Planter> sortByPlanterHeight();
	public List<Planter> sortByPlanterCost();
	public List<Planter> sortByPlanterShape();
	public List<Planter> sortByPlanterColor();
	
	public List<Planter> listByplanterShape(String planterShape);

}

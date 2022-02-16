package com.cg.NurseryManagement.repository;

import java.util.List;

import com.cg.NurseryManagement.entity.Combo;

public interface CustomComboRepo {
	public List<Combo> findComboByComboId(int comboId);
	//public List<Combo> getComboByPlantwithchoclatecombo();
	//public List<Combo> getComboByPlanterwithchoclatecombo();
	
	//public List<Combo> sortByComboCost(double cost1,double cost2);

	//public List<Combo> getallcombos();

}

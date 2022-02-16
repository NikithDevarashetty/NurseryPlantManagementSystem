package com.cg.NurseryManagement.service;

import java.util.List;

import com.cg.NurseryManagement.entity.Combo;

public interface IComboService {
	public boolean addCombo(Combo combo);
	public Combo updateCombo(Combo combo);
	public boolean deleteCombo(int combo);
	public Combo viewCombo(int comboid);
	//public double getComboCost(int plantId,int planterId,int SeedId);
	public double getComboCost(int comboId);
	
	//public List<Combo> getComboByPlantwithchoclatecombo();
	//public List<Combo> getComboByPlanterwithchoclatecombo();	
	//public List<Combo> sortByComboCost();
	public List<Combo> getAllCombos();

}

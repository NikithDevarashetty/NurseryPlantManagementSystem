package com.cg.NurseryManagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.entity.Combo;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Planter;
import com.cg.NurseryManagement.entity.Seed;
import com.cg.NurseryManagement.repository.ComboRepo;
import com.cg.NurseryManagement.repository.IPlantRepository;
import com.cg.NurseryManagement.repository.IPlanterRepository;
import com.cg.NurseryManagement.repository.ISeedRepository;

@Service
public class ComboServiceImpl implements IComboService{
    @Autowired
    ComboRepo comborepo; 
    @Autowired
    IPlantRepository plantrepo;
    @Autowired
    IPlanterRepository planterrepo;
    @Autowired
    ISeedRepository seedrepo;
	@Override
	public boolean addCombo(Combo combo) {
		// TODO Auto-generated method stub
		comborepo.save(combo);
		return true;
	}

	@Override
	@Transactional
	public Combo updateCombo(Combo combo) {
		// TODO Auto-generated method stub
		comborepo.save(combo);
		return combo;
	}

	@Override
	public boolean deleteCombo(int combo) {
		// TODO Auto-generated method stub
		Combo co=comborepo.findById(combo).get();
		comborepo.delete(co);
		return false;
	}

	@Override
	public Combo viewCombo(int comboid) {
		// TODO Auto-generated method stub
		return comborepo.findById(comboid).get();
	}

	
	/*
	@Override
	public List<Combo> getComboByPlantwithchoclatecombo() {
		// TODO Auto-generated method stub
		return comborepo.getComboByPlantwithchoclatecombo();
	}

	@Override
	public List<Combo> getComboByPlanterwithchoclatecombo() {
		// TODO Auto-generated method stub
		return comborepo.getComboByPlanterwithchoclatecombo();
	}

	@Override
	public List<Combo> sortByComboCost() {
		// TODO Auto-generated method stub
		return comborepo.sortByComboCost();
	}*/

	@Override
	public List<Combo> getAllCombos() {
		// TODO Auto-generated method stub
		return (List<Combo>) comborepo.findAll();
	}
/*
	@Override
	public double getComboCost(int plantId, int planterId, int seedId) {
		// TODO Auto-generated method stub
		Plant p = plantrepo.findById(plantId).get();
		Planter pl = planterrepo.findById(planterId).get();
		Seed s=seedrepo.findById(seedId).get();
		double comboCost=p.getPlantCost()+pl.getPlanterCost()+s.getSeedsCost();
		return comboCost;
	}
*/
	@Override
	public double getComboCost(int comboId) {
		// TODO Auto-generated method stub
		Combo c=comborepo.findById(comboId).get();
		Plant p=plantrepo.findById(c.getPlantId()).get();
		Planter pl =planterrepo.findById(c.getPlanterId()).get();
		Seed s= seedrepo.findById(c.getSeedId()).get();
		double comboCost=c.getChocolateCost()+p.getPlantCost()+pl.getPlanterCost()+s.getSeedsCost();
		return comboCost;
	}

	

	

}

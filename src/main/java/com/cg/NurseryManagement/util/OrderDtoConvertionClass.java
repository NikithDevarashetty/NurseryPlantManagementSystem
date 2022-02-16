package com.cg.NurseryManagement.util;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.entity.Combo;
import com.cg.NurseryManagement.entity.Order1;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Planter;
import com.cg.NurseryManagement.entity.Seed;
import com.cg.NurseryManagement.repository.ComboRepo;
import com.cg.NurseryManagement.repository.IPlantRepository;
import com.cg.NurseryManagement.repository.IPlanterRepository;
import com.cg.NurseryManagement.repository.ISeedRepository;


@Component
public class OrderDtoConvertionClass {
	@Autowired
	ISeedRepository seedrepo;
	@Autowired
	IPlantRepository plantrepo;
	@Autowired
	IPlanterRepository planterrepo;
	@Autowired
	ComboRepo comborepo;
	public OrderBasicInfoDTO getOrderBasicInfoDTO(Order1 order1) {
		OrderBasicInfoDTO dtoObj=new OrderBasicInfoDTO();
		dtoObj.setBookingOrderId(order1.getBookingOrderId());
		dtoObj.setOrderDate(order1.getOrderDate());
		dtoObj.setPurchase_id(order1.getPurchase_id());
		dtoObj.setQuantity(order1.getQuantity());
			
		dtoObj.setuId(order1.getUId());
		dtoObj.setTransactionMode(order1.getTransactionMode());
		if(order1.getPurchase_type().equals("seed")) {
			Seed seed=seedrepo.findById(order1.getPurchase_id()).get();
			dtoObj.setTotalCost(order1.getQuantity()*(seed.getSeedsCost()));
			dtoObj.setPurchase_type(order1.getPurchase_type());
		}
		if(order1.getPurchase_type().equals("plant")) {
			Plant plant=plantrepo.findById(order1.getPurchase_id()).get();
			dtoObj.setTotalCost(order1.getQuantity()*(plant.getPlantCost()));
			dtoObj.setPurchase_type(order1.getPurchase_type());
		}
		if(order1.getPurchase_type().equals("planter")) {
			Planter planter=planterrepo.findById(order1.getPurchase_id()).get();
			dtoObj.setTotalCost(order1.getQuantity()*(planter.getPlanterCost()));
			dtoObj.setPurchase_type(order1.getPurchase_type());
		}
		if(order1.getPurchase_type().equals("combo")) {
			Combo combo=comborepo.findById(order1.getPurchase_id()).get();
			//Combo c=comborepo.findById(order1.).get();
			Plant p=plantrepo.findById(combo.getPlantId()).get();
			Planter pl =planterrepo.findById(combo.getPlanterId()).get();
			Seed s= seedrepo.findById(combo.getSeedId()).get();
			double comboCost=combo.getChocolateCost()+p.getPlantCost()+pl.getPlanterCost()+s.getSeedsCost();
			dtoObj.setTotalCost(order1.getQuantity()*(comboCost));
			dtoObj.setPurchase_type(order1.getPurchase_type());
		}
		
		
		return dtoObj;
	}
	@Transactional
	public Order1 getOrderFromPostOrderDTO(OrderSavePostDTO dto) {
		Order1 o=new Order1();
		o.setBookingOrderId(dto.getBookingOrderId());
		o.setOrderDate(dto.getOrderDate());
		o.setPurchase_id(dto.getPurchase_id());
		o.setUId(dto.getuId());
		o.setQuantity(dto.getQuantity());
		o.setTransactionMode(dto.getTransactionMode());
		if(dto.getPurchase_type().equals("seed")) {
			Seed seed=seedrepo.findById(dto.getPurchase_id()).get();
			o.setTotalCost(dto.getQuantity()*(seed.getSeedsCost()));
			o.setPurchase_type(dto.getPurchase_type());
		}
		if(dto.getPurchase_type().equals("plant")) {
			Plant plant=plantrepo.findById(dto.getPurchase_id()).get();
			o.setTotalCost(dto.getQuantity()*(plant.getPlantCost()));
			o.setPurchase_type(dto.getPurchase_type());
		}
		if(dto.getPurchase_type().equals("planter")) {
			Planter planter=planterrepo.findById(dto.getPurchase_id()).get();
			o.setTotalCost(dto.getQuantity()*(planter.getPlanterCost()));
			o.setPurchase_type(dto.getPurchase_type());
		}
		if(dto.getPurchase_type().equals("combo")) {
			Combo combo=comborepo.findById(dto.getPurchase_id()).get();
			Plant p=plantrepo.findById(combo.getPlantId()).get();
			Planter pl =planterrepo.findById(combo.getPlanterId()).get();
			Seed s= seedrepo.findById(combo.getSeedId()).get();
			double comboCost=combo.getChocolateCost()+p.getPlantCost()+pl.getPlanterCost()+s.getSeedsCost();
			o.setTotalCost(dto.getQuantity()*(comboCost));
			o.setPurchase_type(dto.getPurchase_type());
		}
		
		return o;
	}
}
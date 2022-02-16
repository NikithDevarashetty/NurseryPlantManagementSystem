package com.cg.NurseryManagement.util;

import org.springframework.stereotype.Component;

import com.cg.NurseryManagement.dto.PlanterBasicInfoDto;
import com.cg.NurseryManagement.dto.PlanterSavePostDto;
import com.cg.NurseryManagement.entity.Planter;
@Component
public class PlanterDtoConvertionClass {
	public PlanterBasicInfoDto getPlanterBasicInfoDto(Planter planter) {
		PlanterBasicInfoDto dtoobj = new PlanterBasicInfoDto();
		dtoobj.setPlanterheight(planter.getPlanterheight());
		//do same for all methods
		dtoobj.setDrinageHoles(planter.getDrinageHoles());
		dtoobj.setPlanterCapacity(planter.getPlanterCapacity());
		dtoobj.setPlanterColor(planter.getPlanterColor());
		dtoobj.setPlanterCost(planter.getPlanterCost());
		dtoobj.setPlanterShape(planter.getPlanterShape());
		dtoobj.setPlanterStock(planter.getPlanterStock());
		dtoobj.setPlanterId(planter.getPlanterId());
		dtoobj.setPlanterheight(planter.getPlanterheight());
		
		return dtoobj;
		
	}
	public Planter getPlanterFromPostPlanterDto(PlanterSavePostDto dto) {
		Planter pl = new Planter();
		pl.setPlanterId(dto.getPlanterId());
		pl.setPlanterheight(dto.getPlanterheight());
		pl.setDrinageHoles(dto.getDrinageHoles());
		pl.setPlanterCapacity(dto.getPlanterCapacity());
		pl.setPlanterColor(dto.getPlanterColor());
		pl.setPlanterCost(dto.getPlanterCost());
		pl.setPlanterShape(dto.getPlanterShape());
		pl.setPlanterStock(dto.getPlanterStock());
		
		return pl;
	}

}

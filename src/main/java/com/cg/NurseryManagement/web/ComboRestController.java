package com.cg.NurseryManagement.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.entity.Combo;
import com.cg.NurseryManagement.service.IComboService;
import com.cg.NurseryManagement.service.IOrderService;

@Validated
@RestController
@RequestMapping("/combo")
public class ComboRestController {
	@Autowired
	IComboService comboservice;
	@Autowired
	IOrderService orderservice;
	
	@GetMapping("/combos")
	public List<Combo> getallCombos(){
	return comboservice.getAllCombos();

}
	@GetMapping("/combocost/{comboId}")
	public double getComboCost(@PathVariable int comboId) {
		return comboservice.getComboCost(comboId);
		
	}
	/*
	@GetMapping("/comboCost")
	public List<Combo> sortByComboCost(){
		return comboservice.sortByComboCost();
	}
	@GetMapping("/plantwithChoclate")
	public List<Combo> getComboByPlantwithchoclatecombo(){
	  return comboservice.getComboByPlantwithchoclatecombo();
	}
	 @GetMapping("/planterwithChoclate")
	public List<Combo> getComboByPlanterwithchoclatecombo(){
		return comboservice.getComboByPlanterwithchoclatecombo();
	}
	*/
	 @GetMapping("/combo/{id}")
	 public Combo findComboByComboId(@PathVariable int id,HttpServletRequest req){
		 HttpSession session=req.getSession(false);
			
			if(session!=null) {
			return comboservice.viewCombo(id);
		}
			return null;
	 }
	 @PostMapping("/order")
		public ResponseEntity<OrderBasicInfoDTO> saveOrder(@RequestBody @Valid OrderSavePostDTO order1,HttpServletRequest req){
		 HttpSession session=req.getSession(false);
			
			if(session!=null) {
		 OrderBasicInfoDTO dto=orderservice.saveOrder(order1);
			return new ResponseEntity<OrderBasicInfoDTO>(dto,HttpStatus.OK);
		}
			return null;
	 
	}
}

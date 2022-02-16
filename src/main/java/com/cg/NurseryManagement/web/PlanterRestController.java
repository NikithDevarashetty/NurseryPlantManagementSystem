package com.cg.NurseryManagement.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;
import com.cg.NurseryManagement.dto.PlanterBasicInfoDto;
import com.cg.NurseryManagement.dto.PlanterSavePostDto;
import com.cg.NurseryManagement.entity.Planter;
import com.cg.NurseryManagement.service.IOrderService;
import com.cg.NurseryManagement.service.IPlanterService;

@RestController
@RequestMapping("/planter")
public class PlanterRestController {
	@Autowired
	IPlanterService planterService;
	@Autowired
	IOrderService orderservice;
	@GetMapping("/planters")
	public List<Planter> getAllPlanters(HttpServletRequest req)
	{HttpSession session=req.getSession(false);
	if(session!=null) {
		return planterService.getAllPlanters();}
	return null;
		//http://localhost:8091/planter/planters
	}
	@GetMapping("/splheight")
	public List<Planter> sortByPlanterHeight(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
	
		return planterService.sortByPlanterHeight();
		}
	return null;
		//http://localhost:8091/planter/splheight
	}
	@GetMapping("/splcost")
	public List<Planter> sortByPlanterCost(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.sortByPlanterCost();
		}
	return null;
		//http://localhost:8091/planter/splcost
	}
	@GetMapping("/splshape")
	public List<Planter> sortByPlanterShape(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.sortByPlanterShape();
		}
		return null;
		//http://localhost:8091/planter/splshape
	}
	@GetMapping("/splcolor")
	public List<Planter> sortByPlanterColor(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.sortByPlanterColor();
		}
		return null;
		//http://localhost:8091/planter/splcolor
	}
	@GetMapping("/plid")
	public Planter viewPlanter(@RequestParam int planterId,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.viewPlanter(planterId);
		}
		return null;
		//http://localhost:8091/plant/PId?plantId=88
	}
	@GetMapping("/plshape")
	public List<Planter> getAllPlanters(@RequestParam String planterShape,HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.listByplanterShape(planterShape);
		}
		return null;
		//http://localhost:8091/planter/plshape?planterShape=circle
	}
	@PostMapping("/")
	public ResponseEntity<PlanterBasicInfoDto> savePlanter(@RequestBody @Valid PlanterSavePostDto planter,HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			PlanterBasicInfoDto dto=planterService.savePlanter(planter);
		
		return new ResponseEntity<PlanterBasicInfoDto>(dto,HttpStatus.OK);
		}
		return null;
	}
	@DeleteMapping("/delete")
	public boolean removePlanter(@RequestParam int planterId,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return planterService.removePlanter(planterId);
		}
		return false;
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

package com.cg.NurseryManagement.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.dto.PlantBasicInfoDto;
import com.cg.NurseryManagement.dto.PlantSavePostDto;
import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.service.IOrderService;
import com.cg.NurseryManagement.service.IPlantService;


@Validated
@RestController
@RequestMapping("/plant")
public class PlantRestController {
	@Autowired
	IPlantService plantService;
	@Autowired
	IOrderService orderservice;
	@GetMapping("/plants")
	public List<Plant> getAllPlants(HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.getAllPlants();
		}
		return null;
		//http://localhost:8091/plant/plants
	}
	@GetMapping("/PId")
	public Plant getAllPlants(@RequestParam int plantId,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.viewPlant(plantId);
		//http://localhost:8091/plant/PId?plantId=88
	}
		return null;
	}
	@GetMapping("/spheight")
	
	public List<Plant> sortByPlantHeight(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.sortByPlantHeight();
	}
	return null;
	}
	@GetMapping("/spcost")
	public List<Plant> sortByPlantCost(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.sortByPlantCost();
		}
	
	return null;
		
	}
	
	@GetMapping("/sptemp")
	public List<Plant> sortByPlantTemp(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.sortByPlantTemp();
		}
		return null;
	}
	@PostMapping("/")
	public ResponseEntity<PlantBasicInfoDto> savePlant(@RequestBody @Valid PlantSavePostDto plant,HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			PlantBasicInfoDto dto=plantService.savePlant(plant);
		
		return new ResponseEntity<PlantBasicInfoDto>(dto,HttpStatus.OK);
	}
	return null;
	}
	@DeleteMapping("/delete")
	public boolean removePlant(@RequestParam int plantId,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return plantService.removePlant(plantId);
		}
		return false;
		//http://localhost:8091/plant/delete?plantId=88
	}
	
	@GetMapping("/tempr/{temp1}/{temp2}")
	public List<Plant> getPlantByTemperature(@PathVariable int temp1 , @PathVariable int  temp2,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
	
		return plantService.getPlantByTemperature(temp1, temp2);
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

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
import com.cg.NurseryManagement.dto.SeedBasicInfoDto;
import com.cg.NurseryManagement.dto.SeedSavePostDto;
import com.cg.NurseryManagement.entity.Order1;
import com.cg.NurseryManagement.entity.Seed;
import com.cg.NurseryManagement.service.IOrderService;
import com.cg.NurseryManagement.service.ISeedService;

@RestController
@RequestMapping("/seed")
public class SeedRestController {
	@Autowired
	ISeedService seedService;
	@Autowired
	IOrderService orderservice;
	@GetMapping("/seeds")
	public List<Seed> getAllSeeds(HttpServletRequest req)
	{
		HttpSession session=req.getSession(false);
		if(session!=null) {
		return seedService.getAllSeeds();
		//http://localhost:8091/seed/seeds}
		}
		return null;
	}
	@GetMapping("/seedCost")
	public List<Seed> sortBySeedCost(HttpServletRequest req){	
	HttpSession session=req.getSession(false);
	if(session!=null) {
		return seedService.sortBySeedCost();
	}
	return null;
		//http://localhost:8091/seed/seedCost
	}
	@GetMapping("/seedTemp")
	public List<Seed> sortBySeedTemp(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return seedService.sortBySeedTemp();
		}
		return null;
		//http://localhost:8091/seed/seedTemp
	}
	@GetMapping("/dlevel")
	public List<Seed> getAllSeeds(@RequestParam String difficultyLevel,HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return seedService.viewListBydifficultyLevel(difficultyLevel);
		}
		return null;
		//http://localhost:8091/seed/dlevel?difficultyLevel=7
	}
	@PostMapping("/") 
	public ResponseEntity<SeedBasicInfoDto> saveSeed(@RequestBody @Valid SeedSavePostDto seed,HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			SeedBasicInfoDto dto1=seedService.saveSeed(seed);
		
		return new ResponseEntity<SeedBasicInfoDto>(dto1,HttpStatus.OK);
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
	@GetMapping("/gorder")
	public List<Order1> getAllOrders(HttpServletRequest req){
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return orderservice.getAllOrders();
		}
		return null;
	}
	@DeleteMapping("/delete")
	public boolean removeSeed(@RequestParam int seedId,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			return seedService.removeSeed(seedId);
		}
		return false;
	}
	
}
package com.cg.NurseryManagement.web;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.NurseryManagement.dto.UserDTO;
import com.cg.NurseryManagement.service.ICustomerService;

@Validated
@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	@Autowired
	ICustomerService customerservice;
	@PostMapping("/login")
	public boolean doLogin(@RequestBody UserDTO userDto,HttpServletRequest request) {
		boolean isUserValidated=false;
		if(userDto.getUsername().equals("nikith") && userDto.getPassword().equals("nikith@123")) {
			isUserValidated=true;
			HttpSession session=request.getSession(true);
			session.setAttribute("username","nikith");
			session.setAttribute("loginTime", LocalTime.now());
			
		}
		return isUserValidated;
	}
	@GetMapping("/logout")
	public String doLogout(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		
		if(session!=null) {
			session.invalidate();
		}
		return "session logot";
	}

}

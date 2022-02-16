package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.entity.Order1;
import com.cg.NurseryManagement.repository.IOrderRepository;
import com.cg.NurseryManagement.util.OrderDtoConvertionClass;
@Service
public class OrderServiceImpl implements IOrderService {
	@Autowired
	OrderDtoConvertionClass dtoConvertion;
	@Autowired
	IOrderRepository orderrepo;
	@Override
	public OrderBasicInfoDTO saveOrder(@Valid OrderSavePostDTO order1) {
		// TODO Auto-generated method stub
		Order1 o1=dtoConvertion.getOrderFromPostOrderDTO(order1);
		Order1 savedObj=orderrepo.save(o1);
		OrderBasicInfoDTO dtoObj=dtoConvertion.getOrderBasicInfoDTO(savedObj);
		
		return dtoObj;
	}
	@Override
	public List<Order1> getAllOrders() {
		// TODO Auto-generated method stub
		return (List<Order1>) orderrepo.findAll();
	}

}
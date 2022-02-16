package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.OrderBasicInfoDTO;
import com.cg.NurseryManagement.dto.OrderSavePostDTO;
import com.cg.NurseryManagement.entity.Order1;

@Service
public interface IOrderService {

	OrderBasicInfoDTO saveOrder(@Valid OrderSavePostDTO order1);

	public List<Order1> getAllOrders();
	

}

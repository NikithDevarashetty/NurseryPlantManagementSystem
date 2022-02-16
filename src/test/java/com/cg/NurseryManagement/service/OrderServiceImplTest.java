package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;



import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Order1;

import com.cg.NurseryManagement.repository.IOrderRepository;
@SpringBootTest
class OrderServiceImplTest {
	@Mock
	IOrderRepository orderrepo;
	@Test
	void testGetAllOrders() {
		List<Order1> actualOutput = new ArrayList<>();
		when(orderrepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Order1>(), actualOutput);
	}

}

package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Customer;

import com.cg.NurseryManagement.repository.ICustomerRepository;
@SpringBootTest
class CustomerServiceImplTest {
	@Mock
	ICustomerRepository customerrepo;
	@Test
	void testViewAllCustomers() {
		List<Customer> actualOutput = new ArrayList<>();
		when(customerrepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Customer>(), actualOutput);
	}

	@Test
	void testFindById() {
		Customer actualCustomer = new Customer();
		Optional<Customer> output=Optional.of(actualCustomer);
		when((customerrepo.findById(1021))).thenReturn(output);
		assertEquals(new Customer(), actualCustomer);
	}

}

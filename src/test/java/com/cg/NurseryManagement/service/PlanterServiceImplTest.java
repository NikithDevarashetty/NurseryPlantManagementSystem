package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Planter;

import com.cg.NurseryManagement.repository.IPlanterRepository;
@SpringBootTest
class PlanterServiceImplTest {
	@Mock
	IPlanterRepository planterrepo;
	@Test
	void testViewPlanter() {
		Planter actualPlanter = new Planter();
		Optional<Planter> output=Optional.of(actualPlanter);
		when((planterrepo.findById(1001))).thenReturn(output);
		assertEquals(new Planter(), actualPlanter);
	}

	@Test
	void testGetAllPlanters() {
		List<Planter> actualOutput = new ArrayList<>();
		when(planterrepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Planter>(), actualOutput);
	}

}

package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.repository.IPlantRepository;
@SpringBootTest
class PlantServiceImplTest {
	@Mock
	IPlantRepository plantrepo;
	@Test
	void testViewPlant() {
		Plant actualPlant = new Plant();
		Optional<Plant> output=Optional.of(actualPlant);
		when((plantrepo.findById(25))).thenReturn(output);
		assertEquals(new Plant(), actualPlant);
		
	}

	@Test
	void testGetAllPlants() {
		List<Plant> actualOutput = new ArrayList<>();
		when(plantrepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Plant>(), actualOutput);	
		
	}

}

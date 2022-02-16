package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Seed;
import com.cg.NurseryManagement.repository.ISeedRepository;
@SpringBootTest
class SeedServiceImplTest {
	@Mock
	ISeedRepository seedrepo;
	@Test
	void testViewSeed() {
		Seed actualSeed = new Seed();
		Optional<Seed> output=Optional.of(actualSeed);
		when((seedrepo.findById(1021))).thenReturn(output);
		assertEquals(new Seed(), actualSeed);
		
	}
	@Test
	void testGetAllSeeds() {
		List<Seed> actualOutput = new ArrayList<>();
		when(seedrepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Seed>(), actualOutput);
		
	}

	

}

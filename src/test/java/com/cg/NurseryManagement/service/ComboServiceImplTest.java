package com.cg.NurseryManagement.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.NurseryManagement.entity.Combo;

import com.cg.NurseryManagement.repository.ComboRepo;
@SpringBootTest
class ComboServiceImplTest {
	@Mock
	ComboRepo comborepo;
	@Test
	void testGetAllCombos() {
		List<Combo> actualOutput = new ArrayList<>();
		when(comborepo.findAll()).thenReturn(actualOutput);
		 assertIterableEquals(new ArrayList<Combo>(), actualOutput);
	}

	@Test
	void testGetComboCost() {
		Combo actualCombo = new Combo();
		Optional<Combo> output=Optional.of(actualCombo);
		when((comborepo.findById(12))).thenReturn(output);
		assertEquals(new Combo(), actualCombo);
	}

}

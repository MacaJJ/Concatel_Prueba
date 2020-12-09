package com.galaxia;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.galaxia.model.Rebel;

public class RebelControllerTest {
	
	@Test
	void addRegister(){	
		String name = "Paul";
		String planet = "Boruru";
		Rebel rebel = new Rebel(name,planet);
		
		Assertions.assertThat(rebel.getName()).isEqualTo(name);
		Assertions.assertThat(rebel.getPlanet()).isEqualTo(planet);
		
	}

}

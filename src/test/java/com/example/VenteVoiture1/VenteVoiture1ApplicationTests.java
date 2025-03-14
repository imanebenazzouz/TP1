package com.example.VenteVoiture1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VenteVoiture1ApplicationTests {

	@Test
	void contextLoads() {
		Voiture v = new Voiture("renault", 20000);
	}

}

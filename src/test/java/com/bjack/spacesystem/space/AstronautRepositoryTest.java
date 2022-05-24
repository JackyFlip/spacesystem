package com.bjack.spacesystem.space;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bjack.spacesystem.space.astronaut.Astronaut;
import com.bjack.spacesystem.space.astronaut.AstronautRepository;

@SpringBootTest
class AstronautRepositoryTest {
	
	@Autowired
	AstronautRepository astronautRepository; 

	@Test
	void test() {
		System.out.println("\nTest begin\n");
		Optional<Astronaut> charles =  astronautRepository.findById("Charles Duke");
		System.out.println(charles.get());
	}
	
	@Test
	void dbTest() {
		List<Astronaut> astronautList = astronautRepository.findAll();
		astronautList.forEach(System.out :: println);
	}

}

package com.bjack.spacesystem.space.station;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bjack.spacesystem.space.astronaut.Astronaut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Service
@AllArgsConstructor
@NoArgsConstructor
public class SpaceStation {
	
	private String name;
	private List<Astronaut> listOfAstronauts;
	private Integer nbOccupiers;
	private List<String> nationalities;
	// add an experiences list
	
	public void doExperimentation(Astronaut astronaut) {
		// pick experience from list
	}

}

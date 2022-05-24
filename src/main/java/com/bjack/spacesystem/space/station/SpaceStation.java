package com.bjack.spacesystem.space.station;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bjack.spacesystem.space.astronaut.Astronaut;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SpaceStation {
	
	private String name;
	private List<Astronaut> listOfAstronauts;
	private Integer nbOccupiers;
	private List<String> nationalities;

}

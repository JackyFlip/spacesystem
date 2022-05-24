package com.bjack.spacesystem.space.agency;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bjack.spacesystem.space.astronaut.Astronaut;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class SpaceAgency {
	
	private String 	name;
	private String 	country;
	private Integer nbEmployees;
	private Integer budget;
	
	
	public boolean hireAstronaut() {
		return false;
	}
	
	public boolean hireEmployee() {
		return false;
	}
	
	public void sendToMission(List<Astronaut> astronautList) {
		// connect to RocketCompany
	}

}

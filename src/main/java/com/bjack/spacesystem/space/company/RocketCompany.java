package com.bjack.spacesystem.space.company;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class RocketCompany {
	
	private String name;
	private Rocket rocket;
	private Integer nbSuccess;
	private Integer nbFailures;

}

package com.bjack.spacesystem.space.agency;

import org.springframework.stereotype.Service;

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

}

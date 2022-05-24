package com.bjack.spacesystem.space.astronaut;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Astronaut {
	
	@Id
	private String 	name;
	private String 	country;
	private String 	gender;
	private String 	flights;
	private Integer totalFlights;
	private String 	totalFlightTime;

}

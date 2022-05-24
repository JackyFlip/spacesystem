package com.bjack.spacesystem.space.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rocket {

	private String 	model;
	private String 	engine;
	private Integer nbEngines;
	private boolean recovery;
	
}

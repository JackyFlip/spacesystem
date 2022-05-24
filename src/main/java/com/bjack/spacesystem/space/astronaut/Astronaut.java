package com.bjack.spacesystem.space.astronaut;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "astronauts")
public class Astronaut {
	
	@Id
	@Column(name = "Name")
	private String 	name;
	
	@Column(name = "Country")
	private String 	country;
	
	@Column(name = "Gender")
	private String 	gender;
	
	@Column(name = "Flights")
	private String 	flights;
	
	@Column(name = "Total_Flights")
	private Integer totalflights;
	
	@Column(name = "Total_Flight_Time")
	private LocalTime totalFlightTime;

	@Override
	public String toString() {
		return "Astronaut [name=" + name + ", country=" + country + ", gender=" + gender + ", totalflights="
				+ totalflights + ", totalFlightTime=" + totalFlightTime + "]";
	}

}

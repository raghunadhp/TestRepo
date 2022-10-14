package com.xyzshow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {
	private String bookingDate;
	
	private String row;
	
	private String col;
	
	private String movieName;
	
	private String TheatreName;
	
	private String city;
	
	private String showTime;

}

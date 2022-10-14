package com.xyzshow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	
	private String reservationId;
	
	private String row;
	
	private String col;
	
	private String movieName;
	
	private String bookingDate;
	
	private String theatreName;
	
	private String screenId;
	
	private String reservationStatus;

}

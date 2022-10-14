package com.xyzshow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyzshow.model.ReservationRequest;
import com.xyzshow.model.Ticket;

@RestController
@RequestMapping("/api/cbook")
public class CustomerController {
	
	@PostMapping(value = "/tickets")
	public ResponseEntity<Ticket> BookMovieTickets(@RequestBody ReservationRequest reservationRequest) {
		
		//decode the reservation request and process it for reserving the ticket for the row  & col in the screen
		
		return ResponseEntity.ok().body(new Ticket());
		
	}
	
	

}

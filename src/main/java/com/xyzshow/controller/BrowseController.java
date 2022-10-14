package com.xyzshow.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyzshow.model.Shows;
import com.xyzshow.service.BrowseService;

@RestController
@RequestMapping("/api/browse")
public class BrowseController {
	
	
	@Autowired
	private BrowseService browseService;
	
	@GetMapping(value = "/{city}/{movie}/{date}", produces = { "application/json" })
	public ResponseEntity<Optional<List<Shows>>> getTheatres(@PathVariable(value = "movie") String movie, @PathVariable(value = "city") String city, 
			@PathVariable(value = "date") String dateTime) {
		List<Shows> result = null;
		if(null!= movie && null!= city & null!= dateTime) {
			result =  browseService.getShows(movie, city, LocalDate.parse(dateTime));
		}
		return ResponseEntity.ok().body(Optional.ofNullable(result));
		
	}

}

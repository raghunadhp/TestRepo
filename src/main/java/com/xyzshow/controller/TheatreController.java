package com.xyzshow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.theatre.ResponseEntity;
import com.example.demo.theatre.model.ShowRequest;
import com.example.demo.theatre.model.ShowResponse;

@RestController
@RequestMapping("/api/tbook")
public class TheatreController {
	
	@Override
	   public ResponseEntity<ShowResponse> createShows(ShowRequest createShow) {
	      ShowResponse showResponse = theatreService.createShow(createShow);
	      return new ResponseEntity<>(showResponse , HttpStatus.OK);
	   }

	   @Override
	   public ResponseEntity<ShowResponse> updateShows(ShowRequest createShow) {
	      ShowResponse showResponse = theatreService.updateShow(createShow);
	      return new ResponseEntity<>(showResponse , HttpStatus.OK);
	   }

	   @Override
	   public ResponseEntity<ShowResponse> deleteShows(ShowRequest createShow) {
	      ShowResponse showResponse = theatreService.deleteShow(createShow);
	      return new ResponseEntity<>(showResponse , HttpStatus.OK);
	
	

}

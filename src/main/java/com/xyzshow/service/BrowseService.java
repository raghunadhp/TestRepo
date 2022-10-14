package com.xyzshow.service;

import java.time.LocalDate;
import java.util.List;

import com.xyzshow.entity.ShowsEntity;
import com.xyzshow.model.Shows;

public interface BrowseService {

	List<Shows> getShows(String movie, String city, LocalDate dateTime);
	
	
	
	

}

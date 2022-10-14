package com.xyzshow.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xyzshow.dao.BrowseDao;
import com.xyzshow.entity.ShowsEntity;
import com.xyzshow.model.Shows;
import com.xyzshow.service.BrowseService;

@Component
public class BrowseServiceImpl implements BrowseService{
	
	@Autowired
	private BrowseDao browseDao;
	

	@Override
	public List<Shows> getShows(String movie, String city, LocalDate dateTime) {
		// TODO Auto-generated method stub
		
		// Evaluate if any business conditions
		List<Shows> resultShows= new ArrayList<>();
		List<ShowsEntity> shows = browseDao.FindallShowsByMovieAndCity(movie, city, dateTime);
		shows.forEach(show -> {
			//Transform entity object to pojo		
			
		});
		return new ArrayList<>();
	}
	
}

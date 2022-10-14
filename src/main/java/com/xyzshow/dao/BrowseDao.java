package com.xyzshow.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzshow.entity.ShowsEntity;
import com.xyzshow.repository.ShowsRepository;

@Service
public class BrowseDao {

	@Autowired
	private ShowsRepository showsRepository;
	
	
	public List<ShowsEntity> FindallShowsByMovieAndCity(String movie, String city, LocalDate date) {
		return showsRepository.findByMovieIdAndTheatre(movie, city, date);
	}
	
}

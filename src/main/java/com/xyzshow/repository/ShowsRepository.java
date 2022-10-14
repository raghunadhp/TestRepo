package com.xyzshow.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xyzshow.entity.ShowsEntity;

public interface ShowsRepository extends JpaRepository<ShowsEntity, Integer>{
	
	   @Query(nativeQuery = true,value = "select * from shows where movie_name = ?1 and city_name = ?2 and sw_dt = ?3")
	   public List<ShowsEntity> findByMovieIdAndTheatre(String movieName, String cityName, LocalDate date);
}

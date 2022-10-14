package com.xyzshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyzshow.entity.MoviesEntity;

public interface MoviesRepository extends JpaRepository<MoviesEntity, Integer>{

	
}

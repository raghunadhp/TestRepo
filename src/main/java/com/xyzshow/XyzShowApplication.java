package com.xyzshow;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xyzshow.entity.MoviesEntity;
import com.xyzshow.entity.ShowsEntity;
import com.xyzshow.repository.MoviesRepository;
import com.xyzshow.repository.ShowsRepository;

@SpringBootApplication
public class XyzShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyzShowApplication.class, args); 
	}
	
//	@Bean
//	CommandLineRunner commandLineRunner(MoviesRepository movieRepo, ShowsRepository showsRepo) {
//		return args-> {
//			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
//		List<MoviesEntity> movies = movieRepo.findAll();
//		System.out.println(LocalDate.now());
//		List<ShowsEntity> shows = showsRepo.findByMovieIdAndTheatre("Black Hawk Down", "Hyderabad", LocalDate.now());
//		shows.forEach(show -> {
//			System.out.println("@@ -> "+show);
//		});
//		movies.forEach(movie -> {
//			System.out.println(movie.toString());
//		});
//		System.out.println("## -> "+movies.toString());
//		}; 
//	}
}

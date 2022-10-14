package com.xyzshow.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class MoviesEntity {
	@Id
	@Column(name = "movie_id")
	private int Id;

	private String movieName;

	private String genere;

	private int duration;

	private LocalDateTime startDate;

	private LocalDateTime endDate;

	private String status;

}

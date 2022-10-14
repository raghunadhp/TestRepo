package com.xyzshow.entity;

import java.sql.Date;
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
@Table(name = "shows")
public class ShowsEntity {

	@Id
	private int showId;

	private int screenId;

	private int theatreId;

	private String theatreName;

	@Column(name = "sw_dt")
	private Date startDate;

	private String movieName;

	private String cityName;

	@Column(name = "st_tm")
	private String showTime;

}

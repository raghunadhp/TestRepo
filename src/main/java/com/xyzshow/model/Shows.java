package com.xyzshow.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Shows {
	private int showId;

	private int screenId;

	private int theatreId;

	private String theatreName;

	private Date startDate;

	private String movieName;

	private String cityName;

	private String showTime;

}

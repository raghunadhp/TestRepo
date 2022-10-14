package com.xyzshow.service;

import com.xyzshow.model.ShowRequest;
import com.xyzshow.model.ShowResponse;

public interface TheatreService {

	ShowResponse bookMovieShow(ShowRequest createMovieShow);

}

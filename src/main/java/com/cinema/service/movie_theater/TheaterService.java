package com.cinema.service.movie_theater;

import com.cinema.dto.movie_theater.TheaterDTO;
import com.cinema.mapper.movie_theater.TheaterMapper;
import com.cinema.repository.movie_theater.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterService {

	private final TheaterRepository theaterRepository;
	private final TheaterMapper theaterMapper;

	@Autowired
	public TheaterService(TheaterRepository theaterRepository, TheaterMapper theaterMapper) {
		this.theaterRepository = theaterRepository;
		this.theaterMapper = theaterMapper;
	}

	public TheaterDTO getTheaterById(Long id) {
		return theaterRepository.findById(id)
				.map(theaterMapper::theaterToTheaterDTO)
				.orElse(null);
	}
}

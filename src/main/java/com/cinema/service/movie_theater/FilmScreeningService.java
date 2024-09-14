package com.cinema.service.movie_theater;

import com.cinema.dto.movie_theater.FilmScreeningDTO;
import com.cinema.mapper.movie_theater.FilmScreeningMapper;
import com.cinema.repository.movie_theater.FilmScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmScreeningService {

	private final FilmScreeningRepository filmScreeningRepository;
	private final FilmScreeningMapper filmScreeningMapper;

	@Autowired
	public FilmScreeningService(FilmScreeningRepository filmScreeningRepository, FilmScreeningMapper filmScreeningMapper) {
		this.filmScreeningRepository = filmScreeningRepository;
		this.filmScreeningMapper = filmScreeningMapper;
	}

	public FilmScreeningDTO getFilmScreeningById(Long id) {
		return filmScreeningRepository.findById(id)
				.map(filmScreeningMapper::filmScreeningToFilmScreeningDTO)
				.orElse(null);
	}
}

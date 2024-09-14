package com.cinema.service.movie;

import com.cinema.dto.movie.MovieDTO;
import com.cinema.repository.movie.MovieRepository;
import com.cinema.mapper.movie.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	private final MovieRepository movieRepository;
	private final MovieMapper movieMapper;

	@Autowired
	public MovieService(MovieRepository movieRepository, MovieMapper movieMapper) {
		this.movieRepository = movieRepository;
		this.movieMapper = movieMapper;
	}

	public MovieDTO getMovieById(Long id) {
		return movieRepository.findById(id)
				.map(movieMapper::movieToMovieDTO)
				.orElse(null);
	}
}

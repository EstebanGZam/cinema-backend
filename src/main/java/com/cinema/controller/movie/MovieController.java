package com.cinema.controller.movie;

import com.cinema.dto.movie.MovieDTO;
import com.cinema.service.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
	private final MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getMovieById(@PathVariable("id") Long id) {
		MovieDTO movieDTO = movieService.getMovieById(id);
		return (movieDTO != null) ?
				ResponseEntity.ok(movieDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Movie not found");
	}
}

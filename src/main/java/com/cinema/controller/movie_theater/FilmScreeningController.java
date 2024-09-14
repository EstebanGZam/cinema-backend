package com.cinema.controller.movie_theater;

import com.cinema.dto.movie_theater.FilmScreeningDTO;
import com.cinema.service.movie_theater.FilmScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/film-screening")
public class FilmScreeningController {

	private final FilmScreeningService filmScreeningService;

	@Autowired
	public FilmScreeningController(FilmScreeningService filmScreeningService) {
		this.filmScreeningService = filmScreeningService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getFilmScreeningById(@PathVariable("id") Long id) {
		FilmScreeningDTO filmScreeningDTO = filmScreeningService.getFilmScreeningById(id);
		return (filmScreeningDTO != null) ?
				ResponseEntity.ok(filmScreeningDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Film Screening not found");
	}
}

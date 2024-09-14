package com.cinema.controller;

import com.cinema.dto.movie_theater.TheaterDTO;
import com.cinema.service.movie_theater.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theater")
public class TheaterController {

	private final TheaterService theaterService;

	@Autowired
	public TheaterController(TheaterService theaterService) {
		this.theaterService = theaterService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getTheaterById(@PathVariable Long id) {
		TheaterDTO theaterDTO = theaterService.getTheaterById(id);
		return (theaterDTO != null) ?
				ResponseEntity.ok(theaterDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Theater not found");
	}
}

package com.cinema.controller;

import com.cinema.dto.movie.NationalityDTO;
import com.cinema.service.movie.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nationality")
public class NationalityController {

	private final NationalityService nationalityService;

	@Autowired
	public NationalityController(NationalityService nationalityService) {
		this.nationalityService = nationalityService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getNationalityById(@PathVariable Long id) {
		NationalityDTO nationalityDTO = nationalityService.getNationalityById(id);
		return (nationalityDTO != null) ?
				ResponseEntity.ok(nationalityDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nationality not found");
	}
}

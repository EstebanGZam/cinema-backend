package com.cinema.controller.movie;

import com.cinema.dto.movie.DirectorDTO;
import com.cinema.service.movie.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/director")
public class DirectorController {

	private final DirectorService directorService;

	@Autowired
	public DirectorController(DirectorService directorService) {
		this.directorService = directorService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getDirectorById(@PathVariable Long id) {
		DirectorDTO directorDTO = directorService.getDirectorById(id);
		return (directorDTO != null) ?
				ResponseEntity.ok(directorDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Director not found");
	}
}


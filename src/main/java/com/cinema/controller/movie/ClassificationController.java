package com.cinema.controller.movie;

import com.cinema.dto.movie.ClassificationDTO;
import com.cinema.service.movie.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classification")
public class ClassificationController {

	private final ClassificationService classificationService;

	@Autowired
	public ClassificationController(ClassificationService classificationService) {
		this.classificationService = classificationService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getClassificationById(@PathVariable Long id) {
		ClassificationDTO classificationDTO = classificationService.getClassificationById(id);
		if (classificationDTO != null) {
			return ResponseEntity.ok(classificationDTO);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Classification not found");
		}
	}
}

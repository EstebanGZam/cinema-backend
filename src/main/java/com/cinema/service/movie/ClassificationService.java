package com.cinema.service.movie;

import com.cinema.dto.movie.ClassificationDTO;
import com.cinema.mapper.movie.ClassificationMapper;
import com.cinema.repository.movie.ClassificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassificationService {

	private final ClassificationRepository classificationRepository;
	private final ClassificationMapper classificationMapper;

	@Autowired
	public ClassificationService(ClassificationRepository classificationRepository, ClassificationMapper classificationMapper) {
		this.classificationRepository = classificationRepository;
		this.classificationMapper = classificationMapper;
	}

	public ClassificationDTO getClassificationById(Long id) {
		return classificationRepository.findById(id)
				.map(classificationMapper::classificationToClassificationDTO)
				.orElse(null);
	}
}

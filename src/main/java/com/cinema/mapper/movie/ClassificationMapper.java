package com.cinema.mapper.movie;

import com.cinema.dto.movie.ClassificationDTO;
import com.cinema.model.movie.Classification;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClassificationMapper {

	ClassificationDTO classificationToClassificationDTO(Classification classification);

	//	Classification classificationDTOToClassification(ClassificationDTO classificationDTO);
}

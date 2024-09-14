package com.cinema.dto.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassificationDTO {

	private Long id;
	private String classification;
	private Set<MovieDTO> movies;

}

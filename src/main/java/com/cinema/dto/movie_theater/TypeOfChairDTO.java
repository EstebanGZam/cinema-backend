package com.cinema.dto.movie_theater;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfChairDTO {

	private Long id;
	private String type;
	private Set<ChairDTO> chairs;
}

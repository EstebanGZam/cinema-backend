package com.cinema.dto.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDTO {

	private Long id;
	private String name;
	private Date birthdate;
	private NationalityDTO nationality;
	private Set<MovieDTO> movies;
}

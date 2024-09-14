package com.cinema.dto.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTO {

	private Long id;
	private String title;
	private String synopsis;
	private int duration;
	private Date releaseDate;
	private ClassificationDTO classification;
	private DirectorDTO director;
}

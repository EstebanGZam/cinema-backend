package com.cinema.model.movie_theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FilmScreeningId implements Serializable {

	private Long id;
	private String room;
	private Long movie;

}

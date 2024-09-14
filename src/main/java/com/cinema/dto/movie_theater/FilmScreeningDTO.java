package com.cinema.dto.movie_theater;

import com.cinema.dto.movie.MovieDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmScreeningDTO {

	private Long id;
	private Timestamp startTime;
	private RoomDTO room;
	private MovieDTO movie;

}

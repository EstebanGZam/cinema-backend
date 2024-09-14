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
public class RoomDTO {

	private String id;
	private TheaterDTO theater;
	private char accessibility;
	private Set<FilmScreeningDTO> filmScreenings;
	private Set<ChairDTO> chairs;

}

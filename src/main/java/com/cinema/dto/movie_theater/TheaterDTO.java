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
public class TheaterDTO {

	private Long id;
	private String name;
	private String address;
	private Set<RoomDTO> rooms;

}

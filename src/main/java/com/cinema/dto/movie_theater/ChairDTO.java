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
public class ChairDTO {

	private String id;
	private char status;
	private TypeOfChairDTO typeOfChair;
	private Set<RoomDTO> rooms;
}


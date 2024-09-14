package com.cinema.mapper.movie_theater;

import com.cinema.dto.movie_theater.TheaterDTO;
import com.cinema.model.movie_theater.Theater;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TheaterMapper {

	TheaterDTO theaterToTheaterDTO(Theater theater);

	//	Theater theaterDTOToTheater(TheaterDTO theaterDTO);
}

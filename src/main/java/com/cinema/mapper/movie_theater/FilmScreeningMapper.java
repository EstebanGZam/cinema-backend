package com.cinema.mapper.movie_theater;

import com.cinema.dto.movie_theater.FilmScreeningDTO;
import com.cinema.model.movie_theater.FilmScreening;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FilmScreeningMapper {

	FilmScreeningDTO filmScreeningToFilmScreeningDTO(FilmScreening filmScreening);

	//	FilmScreening filmScreeningDTOToFilmScreening(FilmScreeningDTO filmScreeningDTO);
}

package com.cinema.mapper.movie;

import com.cinema.dto.movie.MovieDTO;
import com.cinema.model.movie.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MovieMapper {
	MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);


	MovieDTO movieToMovieDTO(Movie movie);

	//	Movie movieDTOToMovie(MovieDTO movieDTO);
}

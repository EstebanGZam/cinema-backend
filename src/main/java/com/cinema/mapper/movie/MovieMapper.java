package com.cinema.mapper.movie;

import com.cinema.dto.movie.MovieDTO;
import com.cinema.model.movie.Movie;
import org.mapstruct.Mapper;

@Mapper
public interface MovieMapper {

	MovieDTO movieToMovieDTO(Movie movie);

	//	Movie movieDTOToMovie(MovieDTO movieDTO);
}

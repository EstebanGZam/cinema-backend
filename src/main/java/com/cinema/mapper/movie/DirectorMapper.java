package com.cinema.mapper.movie;

import com.cinema.dto.movie.DirectorDTO;
import com.cinema.model.movie.Director;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DirectorMapper {

	DirectorDTO directorToDirectorDTO(Director director);

	//	Director directorDTOToDirector(DirectorDTO directorDTO);
}

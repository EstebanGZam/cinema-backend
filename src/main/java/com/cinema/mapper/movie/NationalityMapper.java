package com.cinema.mapper.movie;

import com.cinema.dto.movie.NationalityDTO;
import com.cinema.model.movie.Nationality;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NationalityMapper {

	NationalityDTO nationalityToNationalityDTO(Nationality nationality);

	//	Nationality nationalityDTOToNationality(NationalityDTO nationalityDTO);
}

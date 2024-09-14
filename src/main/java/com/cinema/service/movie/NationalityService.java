package com.cinema.service.movie;

import com.cinema.dto.movie.NationalityDTO;
import com.cinema.mapper.movie.NationalityMapper;
import com.cinema.repository.movie.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationalityService {

	private final NationalityRepository nationalityRepository;
	private final NationalityMapper nationalityMapper;

	@Autowired
	public NationalityService(NationalityRepository nationalityRepository, NationalityMapper nationalityMapper) {
		this.nationalityRepository = nationalityRepository;
		this.nationalityMapper = nationalityMapper;
	}

	public NationalityDTO getNationalityById(Long id) {
		return nationalityRepository.findById(id)
				.map(nationalityMapper::nationalityToNationalityDTO)
				.orElse(null);
	}
}

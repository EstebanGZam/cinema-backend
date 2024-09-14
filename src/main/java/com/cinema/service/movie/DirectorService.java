package com.cinema.service.movie;

import com.cinema.dto.movie.DirectorDTO;
import com.cinema.mapper.movie.DirectorMapper;
import com.cinema.repository.movie.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {

	private final DirectorRepository directorRepository;
	private final DirectorMapper directorMapper;

	@Autowired
	public DirectorService(DirectorRepository directorRepository, DirectorMapper directorMapper) {
		this.directorRepository = directorRepository;
		this.directorMapper = directorMapper;
	}

	public DirectorDTO getDirectorById(Long id) {
		return directorRepository.findById(id)
				.map(directorMapper::directorToDirectorDTO)
				.orElse(null);
	}
}

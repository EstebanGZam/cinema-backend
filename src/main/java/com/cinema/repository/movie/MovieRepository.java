package com.cinema.repository.movie;

import com.cinema.model.movie.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}

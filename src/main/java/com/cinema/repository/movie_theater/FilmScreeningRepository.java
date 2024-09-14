package com.cinema.repository.movie_theater;

import com.cinema.model.movie_theater.FilmScreening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmScreeningRepository extends CrudRepository<FilmScreening, Long> {
}

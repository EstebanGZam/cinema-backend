package com.cinema.repository.movie_theater;

import com.cinema.model.movie_theater.Theater;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends CrudRepository<Theater, Long> {
}

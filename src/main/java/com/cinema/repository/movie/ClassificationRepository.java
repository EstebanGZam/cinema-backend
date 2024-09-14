package com.cinema.repository.movie;

import com.cinema.model.movie.Classification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationRepository extends CrudRepository<Classification, Long> {
}

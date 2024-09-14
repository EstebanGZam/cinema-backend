package com.cinema.repository.movie_theater;

import com.cinema.model.movie_theater.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, String> {
}

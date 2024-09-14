package com.cinema.mapper.movie_theater;

import com.cinema.dto.movie_theater.RoomDTO;
import com.cinema.model.movie_theater.Room;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoomMapper {

	RoomDTO roomToRoomDTO(Room room);

	//	Room roomDTOToRoom(RoomDTO roomDTO);
}

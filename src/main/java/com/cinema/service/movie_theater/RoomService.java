package com.cinema.service.movie_theater;

import com.cinema.dto.movie_theater.RoomDTO;
import com.cinema.mapper.movie_theater.RoomMapper;
import com.cinema.repository.movie_theater.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

	private final RoomRepository roomRepository;
	private final RoomMapper roomMapper;

	@Autowired
	public RoomService(RoomRepository roomRepository, RoomMapper roomMapper) {
		this.roomRepository = roomRepository;
		this.roomMapper = roomMapper;
	}

	public RoomDTO getRoomById(String id) {
		return roomRepository.findById(id)
				.map(roomMapper::roomToRoomDTO)
				.orElse(null);
	}
}

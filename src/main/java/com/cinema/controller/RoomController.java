package com.cinema.controller;

import com.cinema.dto.movie_theater.RoomDTO;
import com.cinema.service.movie_theater.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {

	private final RoomService roomService;

	@Autowired
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getRoomById(@PathVariable String id) {
		RoomDTO roomDTO = roomService.getRoomById(id);
		return (roomDTO != null) ?
				ResponseEntity.ok(roomDTO) :
				ResponseEntity.status(HttpStatus.NOT_FOUND).body("Room not found");
	}
}

package com.cinema.controller;

import com.cinema.dto.reservation.ReservationDTO;
import com.cinema.service.reservation.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	private final ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@Autowired
	public ReservationService getReservationService(ReservationService reservationService) {
		return reservationService;
	}

	@PostMapping
	public ResponseEntity<?> createReservation(@RequestBody ReservationDTO reservationDTO) {
		ReservationDTO createdReservation = reservationService.createReservation(reservationDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdReservation);
	}

}


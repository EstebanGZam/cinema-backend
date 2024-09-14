package com.cinema.dto.reservation;

import com.cinema.dto.movie_theater.FilmScreeningDTO;
import com.cinema.dto.user.ClientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

	private Long id;
	private int numberOfReservedSeats;
	private Timestamp reservationDate;
	private FilmScreeningDTO filmScreening;
	private ClientDTO client;
}

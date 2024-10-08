package com.cinema.model.reservation;

import com.cinema.model.user.Client;
import com.cinema.model.movie_theater.FilmScreening;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "reservations")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(nullable = false)
	private int numberOfReservedSeats;

	@Column(nullable = false)
	private Timestamp reservationDate;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "film_screening_id", referencedColumnName = "id"),
			@JoinColumn(name = "film_screening_movie_id", referencedColumnName = "movie_id"),
			@JoinColumn(name = "film_screening_id_1", referencedColumnName = "room_id")
	})
	private FilmScreening filmScreening;

	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;

}

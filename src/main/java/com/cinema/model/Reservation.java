package com.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	private long id;

	@Column(nullable = false)
	private int numberOfReservedSeats;

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

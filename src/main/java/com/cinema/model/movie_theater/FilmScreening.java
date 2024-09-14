package com.cinema.model.movie_theater;

import com.cinema.model.movie.Movie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "film_screenings")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmScreening {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;

	@Column(nullable = false)
	private Timestamp startTime;

	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

	@ManyToOne
	@JoinColumn(name = "movie_id", nullable = false)
	private Movie movie;

}

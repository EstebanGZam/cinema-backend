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
@IdClass(FilmScreeningId.class)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmScreening {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(nullable = false)
	private Timestamp startTime;

	@Id
	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

	@Id
	@ManyToOne
	@JoinColumn(name = "movie_id", nullable = false)
	private Movie movie;

}

package com.cinema.model.movie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;

	@Column(length = 150, nullable = false)
	private String title;

	@Column(length = 250, nullable = false)
	private String synopsis;

	@Column(nullable = false)
	private int duration;

	@Column(nullable = false)
	private Date releaseDate;

	@ManyToOne
	@JoinColumn(name = "classification_id", nullable = false)
	private Classification classification;

	@ManyToOne
	@JoinColumn(name = "director_id", nullable = false)
	private Director director;
}

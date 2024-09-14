package com.cinema.model.movie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "directors")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(nullable = false)
	private Date birthdate;

	@ManyToOne
	@JoinColumn(name = "nationality_id", nullable = false)
	private Nationality nationality;

	// Relación uno a muchos con Movie
	@OneToMany(mappedBy = "director", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Movie> movies;
}

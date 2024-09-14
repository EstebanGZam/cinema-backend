package com.cinema.model.movie_theater;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "rooms")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@Column(length = 50, nullable = false)
	private String id;

	@ManyToOne
	@JoinColumn(name = "theater_id", nullable = false)
	private Theater theater;

	@Column(length = 1, nullable = false)
	private char accessibility;

	@OneToMany(mappedBy = "room")
	private Set<FilmScreening> filmScreenings;

	@ManyToMany
	@JoinTable(name = "room_chairs",
			joinColumns = @JoinColumn(name = "room_id"),
			inverseJoinColumns = @JoinColumn(name = "chair_id"))
	private Set<Chair> chairs;

}

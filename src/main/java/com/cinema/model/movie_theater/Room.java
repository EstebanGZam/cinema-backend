package com.cinema.model.movie_theater;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rooms")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@Column(length = 50, nullable = false)  // Definir longitud según tu caso
	private String id;

	@ManyToOne
	@JoinColumn(name = "theater_id", nullable = false)
	private Theater theater;

	@Column(length = 1, nullable = false)
	private char accessibility;

}

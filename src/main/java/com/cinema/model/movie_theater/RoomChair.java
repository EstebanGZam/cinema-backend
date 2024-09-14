package com.cinema.model.movie_theater;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "room_chairs")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(RoomChairId.class)
// Clase auxiliar para la clave compuesta
public class RoomChair {

	@Id
	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

	@Id
	@ManyToOne
	@JoinColumn(name = "chair_id", nullable = false)
	private Chair chair;

}

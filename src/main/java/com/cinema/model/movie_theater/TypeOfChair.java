package com.cinema.model.movie_theater;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "types_of_chairs")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfChair {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 50, nullable = false)
	private String type;

	@OneToMany(mappedBy = "typeOfChair")
	private Set<Chair> chairs;

}

package com.cinema.model.movie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nationalities")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Nationality {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;

	@Column(length = 150, nullable = false)
	private String nationality;

}

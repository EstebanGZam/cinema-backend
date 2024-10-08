package com.cinema.model.movie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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
	private Long id;

	@Column(length = 150, nullable = false)
	private String nationality;

	@OneToMany(mappedBy = "nationality")
	private Set<Director> directors;

}

package com.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

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
	private int id;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(nullable = false)
	private Date birthdate;

	@ManyToOne
	@JoinColumn(name = "nationality_id", nullable = false)
	private Nationality nationality;

}

package com.cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chairs")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chair {

	@Id
	@Column(length = 50, nullable = false)
	private String id;

	@Column(length = 1, nullable = false)
	private char status;

	@ManyToOne
	@JoinColumn(name = "type_of_chair_id", nullable = false)
	private TypeOfChair typeOfChair;

}

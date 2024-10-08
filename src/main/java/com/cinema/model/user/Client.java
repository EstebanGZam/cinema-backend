package com.cinema.model.user;

import com.cinema.model.reservation.Reservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "clients")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 20, nullable = false)
	private String idNumber;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(nullable = false)
	private Date dateOfBirth;

	@Column(length = 150, nullable = false)
	private String email;

	@Column(length = 150, nullable = false)
	private String phone;

	@Column(length = 150, nullable = false)
	private String address;

	@Column(length = 50, nullable = false)
	private String gender;

	@OneToMany(mappedBy = "client")
	private Set<Reservation> reservations;

}

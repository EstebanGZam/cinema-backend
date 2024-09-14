package com.cinema.dto.user;

import com.cinema.dto.reservation.ReservationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

	private long id;
	private String idNumber;
	private String name;
	private Date dateOfBirth;
	private String email;
	private String phone;
	private String address;
	private String gender;
	private Set<ReservationDTO> reservations;
}

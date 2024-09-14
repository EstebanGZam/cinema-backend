package com.cinema.service.reservation;

import com.cinema.dto.reservation.ReservationDTO;
import com.cinema.mapper.reservation.ReservationMapper;
import com.cinema.repository.reservation.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cinema.model.reservation.Reservation;


@Service
public class ReservationService {
	private final ReservationRepository reservationRepository;
	private final ReservationMapper reservationMapper = ReservationMapper.INSTANCE;


	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@Autowired
	public ReservationRepository getReservationService(ReservationRepository reservationRepository) {
		return reservationRepository;
	}

	public ReservationDTO createReservation(ReservationDTO reservationDTO) {
		Reservation reservation = reservationMapper.reservationDTOToReservation(reservationDTO);
		Reservation savedReservation = reservationRepository.save(reservation);
		return reservationMapper.reservationToReservationDTO(savedReservation);
	}
}

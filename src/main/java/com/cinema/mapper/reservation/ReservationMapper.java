package com.cinema.mapper.reservation;

import com.cinema.dto.reservation.ReservationDTO;
import com.cinema.model.reservation.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

	ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

	ReservationDTO reservationToReservationDTO(Reservation reservation);

	Reservation reservationDTOToReservation(ReservationDTO reservationDTO);
}

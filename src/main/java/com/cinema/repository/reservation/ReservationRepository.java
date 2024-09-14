package com.cinema.repository.reservation;

import com.cinema.model.reservation.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}

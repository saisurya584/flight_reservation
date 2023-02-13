package com.flight_reservation_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation_app.dto.ReservationUpdateRequest;
import com.flight_reservation_app.entities.Reservation;
import com.flight_reservation_app.repository.ReservationRepository;

@RestController
public class ReservationRestController {
	@Autowired
	private ReservationRepository rr;

	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id)
	{
		Optional<Reservation> findById = rr.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	
	@RequestMapping("/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		Optional<Reservation> findById = rr.findById(request.getId());
		Reservation reservation = findById.get();
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return rr.save(reservation);
	}
}

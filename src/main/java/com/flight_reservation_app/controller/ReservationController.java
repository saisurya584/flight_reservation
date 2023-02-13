package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entities.Passenger;
import com.flight_reservation_app.entities.Reservation;
import com.flight_reservation_app.services.ReservationServiceimp;



@Controller
public class ReservationController {
	@Autowired
	private ReservationServiceimp rsi;
 @RequestMapping("/saveLead")
 public String saveLead(ReservationRequest res,Model model)
 { 
	 Reservation reservationId = rsi.bookFlight(res);
	 model.addAttribute("res",reservationId.getId());
	
	 return"comfirmReservation";
 }
}

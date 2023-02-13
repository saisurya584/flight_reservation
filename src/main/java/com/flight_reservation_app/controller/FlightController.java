package com.flight_reservation_app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation_app.entities.Flight;
import com.flight_reservation_app.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	private FlightRepository fr;
	@RequestMapping("/findFlights")
	public String findflights(@RequestParam("from") String from,@RequestParam("to") String to ,@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,Model model)
	{
		List<Flight> ffl= fr.findFlights(from,to,departureDate);
		model.addAttribute("ffl", ffl);
		return"displayFlights";
	}
	@RequestMapping("/select")
	public String show(@RequestParam("flightId") long id,Model model)
	{ 
		Optional<Flight> findById = fr.findById(id);
		Flight flight = findById.get();
		model.addAttribute("flight",flight);
		return"show";
	}

}

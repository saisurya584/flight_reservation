package com.flight_reservation_app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entities.Flight;
import com.flight_reservation_app.entities.Passenger;
import com.flight_reservation_app.entities.Reservation;
import com.flight_reservation_app.repository.FlightRepository;
import com.flight_reservation_app.repository.PassengerRepository;
import com.flight_reservation_app.repository.ReservationRepository;
import com.flight_reservation_app.utilities.EmailUtil;
import com.flight_reservation_app.utilities.PdfGenerator;

@Service
public class ReservationServiceimp implements ReservationService {
    @Autowired
	private ReservationRepository rr;
    @Autowired
    private PassengerRepository pr;
    @Autowired
    private FlightRepository fr;
    @Autowired
    private PdfGenerator pdfgenerator;
    @Autowired
    private EmailUtil email;
	@Override
	public Reservation bookFlight(ReservationRequest res) {
		Passenger p=new Passenger();
		p.setFirstName(res.getFirstName());
		p.setLastName(res.getLastName());
		p.setMiddleName(res.getMiddleName());
		p.setEmail(res.getEmail());
		p.setPhone(res.getPhone());
		pr.save(p);
		
		long id = res.getFlightId();
		Optional<Flight> findById = fr.findById(id);
		Flight flight = findById.get();
		
		Reservation reser=new Reservation();
		reser.setFlight(flight);
	    reser.setPassenger(p);
	    reser.setNumberOfBags(0);
	    reser.setCheckedIn(false);
	    rr.save(reser);
	    
	    String filePath="D:\\ss\\stscode\\flight_reservation_app\\tickets\\"+reser.getId()+".pdf";
	    pdfgenerator.generateItinerary(reser,filePath);
	    email.sendItinerary(p.getEmail(), filePath);
		
		return reser;
	}

}

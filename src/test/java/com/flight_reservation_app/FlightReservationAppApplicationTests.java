package com.flight_reservation_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight_reservation_app.entities.Reservation;
import com.flight_reservation_app.utilities.PdfGenerator;

@SpringBootTest
class FlightReservationAppApplicationTests {

	@Test
	void contextLoads() {
		String filePath="C:\\Users\\msury\\Desktop\\jstl";
		Reservation reser=new Reservation();
		PdfGenerator pd=new PdfGenerator();
		pd.generateItinerary(reser, filePath);
	}

}

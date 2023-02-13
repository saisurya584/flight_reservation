package com.flight_reservation_app.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

/*CREATE TABLE RESERVATION
(
ID INT NOT NULL AUTO_INCREMENT,
CHECKED_IN TINYINT(1),
NUMBER_OF_BAGS INT,
PASSENGER_ID INT,
FLIGHT_ID INT,
CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY(ID),
FOREIGN KEY (PASSENGER_ID) REFERENCES PASSENGER(ID) ON DELETE CASCADE,
FOREIGN KEY (FLIGHT_ID) REFERENCES FLIGHT(ID)
)*/
private boolean checkedIn;
private int numberOfBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Flight flight;
public boolean isCheckedIn() {
	return checkedIn;
}
public void setCheckedIn(boolean checkedIn) {
	this.checkedIn = checkedIn;
}
public int getNumberOfBags() {
	return numberOfBags;
}
public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}

}

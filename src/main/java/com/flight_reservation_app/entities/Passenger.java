package com.flight_reservation_app.entities;

import javax.persistence.Entity;

@Entity
public class Passenger extends AbstractEntity{
/*CREATE TABLE PASSENGER
(
ID INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
MIDDLE_NAME VARCHAR(20),
EMAIL VARCHAR(60),
PHONE VARCHAR(10),
PRIMARY KEY(ID)
)*/
private String firstName;
private String lastName;
private String middleName;
private String Email;
private String phone;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}

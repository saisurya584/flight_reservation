<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Flight Number:${flight.flightNumber}<br>
operating Airlines:${flight.operatingAirlines}<br>
DepartureCity:${flight.departureCity}<br>
ArrivalCity:${flight.arrivalCity}<br>
Departure Date:${flight.dateOfDeparture}<br>
<h2>Enter Passenger Details</h2>
<form action="saveLead" method="post">
<table>
<tr>
   <td>FirstName:</td>
   <td><input type="text" name="firstName"/></td>
</tr>
<tr>
   <td>LastName:</td>
   <td><input type="text" name="lastName"/></td>
</tr>
<tr>
   <td>MiddleName:</td>
   <td><input type="text" name="middleName"/></td>
</tr>
<tr>
   <td>Email:</td>
   <td><input type="text" name="email"/></td>
</tr>
<tr>
   <td>Phone:</td>
   <td><input type="text" name="phone"/></td>
</tr>
<tr>
   <td>Name on the card:</td>
   <td><input type="text" name="cardHolderName" /></td>
</tr>

<tr>
   <td>CardNumber:</td>
   <td><input type="text" name="cardNumber" /></td>
</tr>
<tr>
   <td>cvv:</td>
   <td><input type="text" name="cvv" size="3" /></td>
   <td>Expiry Date:</td>
   <td><input type="text" name="expiryDate"  size="3"/></td>
   
</tr>
<tr>
   <td><input type="hidden" name="flightId" value="${flight.id}"/></td>
</tr>

<tr>
   <td><input type="submit" value="save"/></td>
</tr>
</table>
</form>
</body>
</html>
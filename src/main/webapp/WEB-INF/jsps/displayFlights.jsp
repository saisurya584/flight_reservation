<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
<h2>List of Flights</h2>
<table border="1">
<tr>
   <th>Airlines</th>
   <th>Departure City</th>
   <th>Arrival City</th>
   <th>Departure Time</th>
   <th>Select Flight</th>
</tr>
<c:forEach var="flight" items="${ffl}">
      <tr>
        <td>${flight.operatingAirlines}</td>
        <td>${flight.departureCity}</td>
        <td>${flight.arrivalCity}</td>
        <td>${flight.estimatedDepartureTime}</td>
        <td><a href="select?flightId=${flight.id}">select</a>
      </tr>
 </c:forEach>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Find flights</h1>
<form action="findFlights" method="post">
 From:<input type="text" name="from"/>
 To:<input type="text" name="to"/>
 Departure date:<input type="text" name="departureDate"/>
 <input type="submit" value="search"/>
</form>

</body>
</html>
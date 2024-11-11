<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Reservation details</h2>
	Passenger Name: ${reservation.getPassanger().getFirstName()}
	<br /> Passenger Name: ${reservation.getPassanger().getEmail()}
	<br /> Passenger Name: ${reservation.getPassanger().getPhone()}
	<br /> Operating Airlines:${reservation.getFlight().operatingAirlines}
	<br /> Operating Airlines:${reservation.getFlight().flightNumber}
	<br /> Operating Airlines:${reservation.getFlight().departureCity}
	<br /> Operating Airlines:${reservation.getFlight().arrivalCity}
	<br /> Operating Airlines:${reservation.getFlight().dateOfDeparture}
	<br />
	<h2>Update No. of Bags & Status</h2>
	<form action="ProceedCheckIn" method="post">
		Reservation id<input type="text" name="id" value="${reservation.id}" />
		Number of Bags<input type="text" name="NumberOfBags" /> 
		<input type="submit" value="Proceed" />
	</form>
</body>
</html>
package com.checkIn.integration;



import org.springframework.web.bind.annotation.RequestBody;

import com.checkIn.integration.dto.Reservation;
import com.checkIn.integration.dto.ReservationUpdateRequest;


public interface ReservationRestfullClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);// it take java object and map to json object
}

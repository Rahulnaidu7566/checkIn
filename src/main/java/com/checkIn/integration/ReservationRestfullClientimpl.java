package com.checkIn.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.checkIn.integration.dto.Reservation;
import com.checkIn.integration.dto.ReservationUpdateRequest;


@Component
public class ReservationRestfullClientimpl implements ReservationRestfullClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject("http://localhost:8080/flights/reservation/"+id, Reservation.class);
		return reservation;
		//url will fetch the data from database put that in json object then converted into reservation class
	}
    
	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation", request, Reservation.class);
		return reservation;
	}
}

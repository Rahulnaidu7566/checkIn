package com.checkIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.checkIn.integration.ReservationRestfullClient;
import com.checkIn.integration.dto.Reservation;
import com.checkIn.integration.dto.ReservationUpdateRequest;


@RestController
public class ReservationController {
	
	@Autowired
	private ReservationRestfullClient restClient;

	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	}
	@RequestMapping("/proceedCheckIn")
	public String proceedstartCkeckIn(@RequestParam("id") Long id, ModelMap modelMap)  {
		Reservation reservation = restClient.findReservation(id);
	    modelMap.addAttribute("reservation", reservation);
		return "displayreservation";
	}
	@RequestMapping("/ProceedcheckIn")
	public String proceedstartCkeckIn(@RequestParam("id") Long id, @RequestParam("NumberOfBags") int NumberOfBags )  {
		
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(NumberOfBags);
		request.setCheckInStatus(true);
		
		restClient.updateReservation(request);
		
		return "confirmReservation";
		
	}
}


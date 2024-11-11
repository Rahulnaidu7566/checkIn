package com.checkIn.integration.dto;

public class Reservation {

	private Long id;
	private boolean CheckedIn;
	private int NumberOfBags;
	private Passanger passanger;
	private Flight flight;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isCheckedIn() {
		return CheckedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		CheckedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	public Passanger getPassanger() {
		return passanger;
	}
	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}

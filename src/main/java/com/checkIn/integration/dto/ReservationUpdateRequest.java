package com.checkIn.integration.dto;

public class ReservationUpdateRequest {
	
	private long id;
	private boolean CheckInStatus;
	private int NumberOfBags;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isCheckInStatus() {
		return CheckInStatus;
	}
	public void setCheckInStatus(boolean checkInStatus) {
		CheckInStatus = checkInStatus;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	
}

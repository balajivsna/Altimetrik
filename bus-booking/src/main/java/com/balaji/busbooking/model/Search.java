package com.balaji.busbooking.model;

import java.io.Serializable;

public class Search implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int departure;
	
	private int arrival;
	
	private String traveldate;

	public int getDeparture() {
		return departure;
	}

	public void setDeparture(int departure) {
		this.departure = departure;
	}

	public int getArrival() {
		return arrival;
	}

	public void setArrival(int arrival) {
		this.arrival = arrival;
	}

	public String getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}

	public Search() {

	}
	
	

}

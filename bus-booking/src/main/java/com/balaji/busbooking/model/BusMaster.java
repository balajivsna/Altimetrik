package com.balaji.busbooking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BUS_MASTER")
public class BusMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "BUS_NUMBER")
	private String busNumber;

	@Column(name = "BUS_COMPANY")
	private String busCompany;

	@Column(name = "ARRIVAL_TIME")
	private String arrivalTime;

	@Column(name = "DEPARTURE_TIME")
	private String departureTime;

	@Column(name = "TRAVEL_DATE")
	private String travelDate;

	@Column(name = "REMAINING_SEATS")
	private int remainingSeats;

	@ManyToOne
	@JoinColumn(name = "DEPARTURE_LOC")
	private LocationMaster departureLocation;

	@ManyToOne
	@JoinColumn(name = "ARRIVAL_LOC")
	private LocationMaster arrivalLocation;

	@ManyToOne
	@JoinColumn(name = "FLEET")
	private FleetMaster fleetMaster;

	@ManyToOne
	@JoinColumn(name = "FARE")
	private FareMaster fareMaster;

	public BusMaster() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}

	public LocationMaster getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(LocationMaster departureLocation) {
		this.departureLocation = departureLocation;
	}

	public LocationMaster getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(LocationMaster arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public FleetMaster getFleetMaster() {
		return fleetMaster;
	}

	public void setFleetMaster(FleetMaster fleetMaster) {
		this.fleetMaster = fleetMaster;
	}

	public FareMaster getFareMaster() {
		return fareMaster;
	}

	public void setFareMaster(FareMaster fareMaster) {
		this.fareMaster = fareMaster;
	}

	@Override
	public String toString() {
		return "BusMaster [id=" + id + ", busNumber=" + busNumber + ", busCompany=" + busCompany + ", arrivalTime="
				+ arrivalTime + ", departureTime=" + departureTime + ", travelDate=" + travelDate + ", remainingSeats="
				+ remainingSeats + ", departureLocation=" + departureLocation.getName() + ", arrivalLocation=" + arrivalLocation.getName()
				+ ", fleetMaster=" + fleetMaster.getTotalSeats() + ", fareMaster=" + fareMaster.getFareAmount() + "]";
	}
	
	


}

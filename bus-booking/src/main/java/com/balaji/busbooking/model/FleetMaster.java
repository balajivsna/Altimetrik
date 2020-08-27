package com.balaji.busbooking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FLEET_MASTER")
public class FleetMaster implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name="TOTAL_SEATS")
	private int totalSeats;
	
	@OneToMany(mappedBy="fleetMaster")
	private List<BusMaster> busMasters;

	public FleetMaster() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<BusMaster> getBusMasters() {
		return busMasters;
	}

	public void setBusMasters(List<BusMaster> busMasters) {
		this.busMasters = busMasters;
	}
	

}

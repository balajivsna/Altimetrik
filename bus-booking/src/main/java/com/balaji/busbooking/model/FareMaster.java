package com.balaji.busbooking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FARE_MASTER")
public class FareMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "FARE_AMOUNT")
	private int fareAmount;

	@OneToMany(mappedBy = "fareMaster")
	private List<BusMaster> busMasters;

	public FareMaster() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(int fareAmount) {
		this.fareAmount = fareAmount;
	}

	public List<BusMaster> getBusMasters() {
		return busMasters;
	}

	public void setBusMasters(List<BusMaster> busMasters) {
		this.busMasters = busMasters;
	}
	
	
	
	

}

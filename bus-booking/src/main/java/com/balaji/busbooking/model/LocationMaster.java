package com.balaji.busbooking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION_MASTER")
public class LocationMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "departureLocation")
	private List<BusMaster> busMasters1;

	@OneToMany(mappedBy = "arrivalLocation")
	private List<BusMaster> busMasters2;

	public LocationMaster() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BusMaster> getBusMasters1() {
		return busMasters1;
	}

	public void setBusMasters1(List<BusMaster> busMasters1) {
		this.busMasters1 = busMasters1;
	}

	public List<BusMaster> getBusMasters2() {
		return busMasters2;
	}

	public void setBusMasters2(List<BusMaster> busMasters2) {
		this.busMasters2 = busMasters2;
	}
	
	
	
	

}

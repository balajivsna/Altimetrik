package com.balaji.busbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balaji.busbooking.model.BusMaster;

public interface BusMasterRepository extends JpaRepository<BusMaster, Integer>{

	List<BusMaster> findByDepartureLocation_IdAndArrivalLocation_IdAndTravelDate(int departureLocId, int arrivalLocId, String travelDate);
}

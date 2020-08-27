package com.balaji.busbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.busbooking.model.BusMaster;
import com.balaji.busbooking.repository.BusMasterRepository;

@Service
public class BusMasterService {
	
	@Autowired
	private BusMasterRepository busMasterRepository;
	
	public List<BusMaster> searchBus(int departureLocId, int arrivalLocId, String travelDate ){
		return busMasterRepository.findByDepartureLocation_IdAndArrivalLocation_IdAndTravelDate(departureLocId, arrivalLocId, travelDate);
	}
}

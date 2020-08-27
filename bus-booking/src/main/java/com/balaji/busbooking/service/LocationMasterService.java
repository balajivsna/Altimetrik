package com.balaji.busbooking.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balaji.busbooking.model.LocationMaster;
import com.balaji.busbooking.repository.LocationMasterRepository;

@Service
public class LocationMasterService {
	
	@Autowired
	LocationMasterRepository locationMasterRepository;
	
	public Map<String, String> getAllLocations(){
		Map<String, String> locationMap = new HashMap<>();
		List<LocationMaster> locationList =  locationMasterRepository.findAll();
		for(LocationMaster location : locationList )
			locationMap.put(location.getId()+"", location.getName());
		return locationMap;
	}

}

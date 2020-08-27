package com.balaji.busbooking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.balaji.busbooking.model.BusMaster;
import com.balaji.busbooking.model.Search;
import com.balaji.busbooking.service.BusMasterService;
import com.balaji.busbooking.service.LocationMasterService;

@SessionAttributes({"search","locations","info"})
@Controller
public class HomeControlloer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeControlloer.class);
	
	@Autowired
	BusMasterService busMasterService;
	
	@Autowired
	LocationMasterService locationMasterService;
	
	@GetMapping(value="/")
	public String homePage(Model model) {
		if(!model.containsAttribute("search"))
			model.addAttribute("search",new Search());
		
		if(!model.containsAttribute("locations"))
			model.addAttribute("locations",locationMasterService.getAllLocations());
		
		if(!model.containsAttribute("info"))
			model.addAttribute("info","Please start to search..");
		
		return "index";
	}
	
	@GetMapping(value="/search")
	public String searchBus(@ModelAttribute("search") Search search, Model model) {
		
		List<BusMaster> busList = busMasterService.searchBus(search.getDeparture(), search.getArrival(), search.getTraveldate());
		
		LOGGER.info("Bus List: "+busList);
		
		if(busList.isEmpty())
			model.addAttribute("info","Data not found!");
		
		model.addAttribute("busList",busList); 
		
		return "index";
		
	}

}

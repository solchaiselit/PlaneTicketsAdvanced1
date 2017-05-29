package com.planetickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.planetickets.entity.City;
import com.planetickets.service.CityService;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/city")
	public String city(Model model){
		
		model.addAttribute("cities", cityService.findAll());
		return "city";
	}
	
	@PostMapping("/city")
	public String city(@RequestParam String city){
		
		City city1 = new City();
		
		city1.setName(city);
		
		cityService.save(city1);
		
		return "redirect:/city";
	}
	
	
	@GetMapping("/deleteCity/{id}")
	public String delete(@PathVariable int id){
		
		cityService.delete(id);		
		return "redirect:/city";	
	}
	
	@GetMapping("/updateCity/{id}")
	public String update(@PathVariable int id, Model model){
		
	    City city = cityService.findOne(id);
	    
	    model.addAttribute("currentCity", city);
		
	    	    
		return "updateCity";
		
	}
	
	@PostMapping("/updateCity/{id}")
	public String update(@PathVariable int id, @RequestParam String city){
		
		City city1 = cityService.findOne(id);
		
		city1.setName(city);
		
		cityService.save(city1);
		
		return "redirect:/city";
	}
	

}
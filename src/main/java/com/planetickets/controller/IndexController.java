package com.planetickets.controller;

import com.planetickets.service.CityService;
import com.planetickets.service.FlightService;
import com.planetickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


	@Autowired
	private UserService userService;

	@Autowired
	private  FlightService flightService;

	@GetMapping("/")
	public String index(){

		System.out.println("YOOOO");
//		System.out.println("YO1:" + flightService.findFlightWithFreeSeats(6).toString());



		return "index";
	}
	

}

package com.planetickets.controller;

import com.planetickets.editor.CityEditor;
import com.planetickets.entity.City;
import com.planetickets.entity.Flight;
import com.planetickets.service.CityService;
import com.planetickets.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class FlightController {


    @Autowired
    private FlightService flightService;
    @Autowired
    private CityService cityService;
//    @Autowired
//    private FreeSeatService freeSeatService;

    @InitBinder
    public void init(WebDataBinder binder){
        binder.registerCustomEditor(City.class, new CityEditor());
//        binder.registerCustomEditor(FreeSeat.class, new FreeSeatEditor());
    }



    @GetMapping("/flight")
    public String flight(Model model){

        model.addAttribute("cities", cityService.findAll());
        model.addAttribute("flight", new Flight());

        return "flight";
    }


    @PostMapping("/flight")
    public String save(){


        return "redirect:/flight";
    }

    @GetMapping("/flightList")
    public String viewFlights(Model model){

        model.addAttribute("flights", flightService.findAll());
//        model.addAttribute("freeSeats", flightService.);

        return "/flightList";
    }

    @GetMapping("/deleteFlight/{id}")
    public String delete(@PathVariable int id){

        flightService.delete(id);

        return "redirect:/flightList";
    }


//    @PostMapping("/saveFlight")
//    public String  saveFlight(@RequestParam String cityName, @RequestParam String departureDate){
//
////        City city = new City(cityName);
////
////        Flight flight = new Flight();
//
//
//
////        flight.setDepartureDate(LocalDate.parse(departureDate));
//
//        flightService.save(flight);
//
//        return "redirect:/flight";
//    }

    @PostMapping("/saveFlight")
    public String  saveFlight(@ModelAttribute Flight flight, @RequestParam String departur){


        System.out.println("departureDate = " + departur);

        flight.setDepartureDate(LocalDate.parse(departur));

        

        flightService.save(flight);

        return "redirect:/flight";
    }




}

package com.planetickets.service;

import java.util.Date;
import java.util.List;

import com.planetickets.entity.Flight;
import com.planetickets.entity.FreeSeat;
import org.springframework.data.repository.query.Param;

public interface FlightService {

	void save(Flight flight);
	List<Flight> findAll();
	Flight findOne(int id);
	void delete(int id);
	void update(Flight flight);

//	List<FreeSeat> findFreeSeatsFromFlight(int id);

//	Flight findFlightWithFreeSeats (int id);


	
}

package com.planetickets.serviceImpl;

import java.util.List;

import com.planetickets.dao.FreeSeatDao;
import com.planetickets.entity.FreeSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.FlightDao;
import com.planetickets.entity.Flight;
import com.planetickets.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightDao flightDao;

//	@Autowired
//	private FreeSeatDao freeSeatDao;

	public void save(Flight flight) {



		flightDao.saveAndFlush(flight);
		
//		for(int i = 0; i<10; i++ ) {
//
//			FreeSeat freeSeat = new FreeSeat(i);
//
//			freeSeatDao.saveAndFlush(freeSeat);
//
//			flight.getFreeSeats().add(freeSeat);
//		}

		flightDao.save(flight);


	}

	public List<Flight> findAll() {
		
		
		
		return flightDao.findAll();
	}

	public Flight findOne(int id) {
		
		return flightDao.findOne(id);
	}

	public void delete(int id) {
		
		flightDao.delete(id);
		
	}

	public void update(Flight flight) {
		
		flightDao.save(flight);
		
	}



//		@Override
//	public Flight findFlightWithFreeSeats(int id) {
//		return flightDao.findFlightWithFreeSeats(id);
//	}



}

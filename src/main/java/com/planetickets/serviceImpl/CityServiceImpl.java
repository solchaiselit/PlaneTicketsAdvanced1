package com.planetickets.serviceImpl;

import java.util.List;

import com.planetickets.dao.FlightDao;
import com.planetickets.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.CityDao;
import com.planetickets.entity.City;
import com.planetickets.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	@Autowired
	private FlightDao flightDao;
	
	public void save(City city) {
		
		cityDao.save(city);
		
	}

	public List<City> findAll() {
	
		return cityDao.findAll();
	}

	public City findOne(int id) {
		
		return cityDao.findOne(id);
	}

	public void delete(int id) {
	
		City city = cityDao.cityWithFlights(id);


		for(Flight flight: city.getFlights()){

			flight.setCity(null);
			flightDao.save(flight);
		}

		cityDao.delete(id);
	}

	public void update(City city) {
	
		cityDao.save(city);
		
	}

	
	
}

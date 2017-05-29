package com.planetickets.service;

import java.util.List;

import com.planetickets.entity.City;

public interface CityService {

	
	void save(City city);
	List<City> findAll();
	City findOne(int id);
	void delete(int id);
	void update(City city);
	
}

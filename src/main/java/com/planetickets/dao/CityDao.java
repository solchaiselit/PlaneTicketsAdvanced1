package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CityDao extends JpaRepository<City, Integer> {

	@Query("select c from City c left join fetch c.flights where c.id=:id")
    City cityWithFlights (@Param("id") int id);
	
}

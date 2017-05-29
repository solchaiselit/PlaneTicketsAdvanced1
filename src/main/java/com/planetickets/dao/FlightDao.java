package com.planetickets.dao;

import java.util.Date;
import java.util.List;

import com.planetickets.entity.FreeSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FlightDao extends JpaRepository<Flight, Integer> {




//    @Query("select f from Flight f left join fetch f.freeSeats where f.id=:id")
//    Flight findFlightWithFreeSeats(@Param("id")int id);
}

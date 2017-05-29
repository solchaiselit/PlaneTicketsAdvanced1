package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.FreeSeat;

public interface FreeSeatDao extends JpaRepository<FreeSeat, Integer> {

	
	
}

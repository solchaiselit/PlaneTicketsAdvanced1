package com.planetickets.service;

import java.util.List;

import com.planetickets.entity.Ticket;

public interface TicketService {

	void save(Ticket ticket);
	List<Ticket> findAll();
	Ticket findOne(int id);
	void delete(int id);
	void update(Ticket ticket);
	
}

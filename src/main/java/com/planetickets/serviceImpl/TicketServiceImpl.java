package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.TicketDao;
import com.planetickets.entity.Ticket;
import com.planetickets.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	
	@Autowired
	private TicketDao ticketDao;
	
	public void save(Ticket ticket) {
		
		ticketDao.save(ticket);
	}

	public List<Ticket> findAll() {
		
		return ticketDao.findAll();
	}

	public Ticket findOne(int id) {
		
		return ticketDao.findOne(id);
	}

	public void delete(int id) {
		
		ticketDao.delete(id);
	}

	public void update(Ticket ticket) {
		
		ticketDao.save(ticket);
	}

	
	
}

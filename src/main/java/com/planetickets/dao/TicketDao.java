package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer> {

		
}

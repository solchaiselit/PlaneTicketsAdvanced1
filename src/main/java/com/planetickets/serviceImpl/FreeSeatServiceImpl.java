package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.FreeSeatDao;
import com.planetickets.entity.FreeSeat;
import com.planetickets.service.FreeSeatService;


@Service
public class FreeSeatServiceImpl implements FreeSeatService {

	@Autowired
	private FreeSeatDao freeSeatDao;
	
	public void save(FreeSeat freeSeat) {
		
		freeSeatDao.save(freeSeat);
	}

	public List<FreeSeat> findAll() {
		
		return freeSeatDao.findAll();
	}

	public FreeSeat findOne(int id) {
		
		return freeSeatDao.findOne(id);
	}

	public void delete(int id) {
	
		freeSeatDao.delete(id);
		
	}

	public void update(FreeSeat freeSeat) {
	
		freeSeatDao.save(freeSeat);
		
	}


	
	
}

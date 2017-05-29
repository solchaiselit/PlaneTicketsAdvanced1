package com.planetickets.serviceImpl;

import java.util.List;

import com.planetickets.dao.CityDao;
import com.planetickets.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.planetickets.dao.UserDao;
import com.planetickets.entity.User;
import com.planetickets.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	@Qualifier("userValidator")
	private Validator validator;




	
	public void save(User user) throws Exception {

		validator.validate(user);
		userDao.save(user);
		
//		System.out.println(user.getFirstName().toString());
		
		
		userDao.save(user);
		
		// validation
		// crypt
		// other logic

//		if (user.getEmail().contains("@")) {
//			userDao.save(user);
//
//		} else {
//			System.out.println("wrong email");
//		}
	}
	

	public List<User> findAll() {
		
		return userDao.findAll();
	}


	public void delete(int id) {

		
		userDao.delete(id);
	}


	public User findOne(int id) {

		return userDao.findOne(id);
	}


	public void update(User user) {
		
		userDao.save(user);
		
	}

	
	
}

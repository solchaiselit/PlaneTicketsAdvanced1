package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.planetickets.entity.User;

public interface UserDao extends JpaRepository <User, Integer> {

    User findByFirstName(String firstName);

    User findByLastName(String lastName);

    User findByEmail(String email);
 
//User findByNameAndEmail(String name, String email);
	
//	@Query("select u from User u left join fetch u.drinks where u.id=:id")
//	User findUserWithDrinks(@Param("id")int id);
}

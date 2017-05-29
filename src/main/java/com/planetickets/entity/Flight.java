package com.planetickets.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Flight {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDate departureDate;
	
	@OneToMany(mappedBy="flight")
	private List<Ticket> tickets = new ArrayList<>();
	
	@ManyToOne
    private City city;
	
//	@ManyToMany
//	@JoinTable(name="flight_seat",
//	joinColumns=@JoinColumn(name="flight_id"),
//	inverseJoinColumns=@JoinColumn(name="seat_id"))
//	private List<FreeSeat> freeSeats = new ArrayList<>();


	public void setUsers(List<User> users) {
		this.users = users;
	}

	@ManyToMany
	@JoinTable(name="flight_user",
	joinColumns=@JoinColumn(name="flight_id"),
	inverseJoinColumns=@JoinColumn(name="user_id"))
	private List<User> users = new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}


	public Flight() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}


	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}




	public List<Ticket> getTickets() {
		return tickets;
	}



	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}



	public City getCity() {
		return city;
	}



	public void setCity(City city) {
		this.city = city;
	}




	@Override
	public String toString() {
		return "Flight{" +
				"id=" + id +
				", departureDate=" + departureDate +
				", city=" + city +
				'}';
	}
}

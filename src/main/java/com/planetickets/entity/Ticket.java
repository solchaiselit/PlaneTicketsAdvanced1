package com.planetickets.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Ticket {

	



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(unique = true, nullable = true)
	private int id;
	
	
	
	@ManyToOne
	private Flight flight;
	

//	private Seat seat;
	
	private int price;
	
	@ManyToOne
	private User user;
	
	private int seatNumber;
	
//	@ManyToOne
//	private OccupiedSeat occupiedSeat;
	
//	private Flight flight;
	
	public Ticket() {
		super();
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", flight=" + flight + ", price=" + price + ", user=" + user + ", seatNumber="
				+ seatNumber + "]";
	}
	
	
}

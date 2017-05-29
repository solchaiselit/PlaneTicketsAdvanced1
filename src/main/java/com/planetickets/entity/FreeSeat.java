package com.planetickets.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class FreeSeat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private int seatNumber;
	
//	@ManyToMany
//	@JoinTable(name="flight_seat",
//	joinColumns=@JoinColumn(name="seat_id"),
//	inverseJoinColumns=@JoinColumn(name="flight_id"))
//	private List<Flight> flights = new ArrayList<>();

	public FreeSeat() {
		super();
	}

	public FreeSeat(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	@Override
	public String toString() {
		return "FreeSeat [Id=" + Id + ", seatNumber=" + seatNumber + "]";
	}



	


	
	
	
}

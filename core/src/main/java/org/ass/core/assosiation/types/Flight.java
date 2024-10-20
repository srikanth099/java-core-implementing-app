package org.ass.core.assosiation.types;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import antlr.collections.List;
@Entity
@Table(name="flights_info")
public class Flight implements Serializable {
	@Id
	@GenericGenerator(name = "auto gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name ="alt_key")
	private long altKey;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="typeof_flight")
	private String typeofFlight;
	
	@Column(name ="numof_seats")
	private int numofSeats;
	
	@Column(name="price")
	private double price;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeofFlight() {
		return typeofFlight;
	}

	public void setTypeofFlight(String typeofFlight) {
		this.typeofFlight = typeofFlight;
	}

	public int getNumofSeats() {
		return numofSeats;
	}

	public void setNumofSeats(int numofSeats) {
		this.numofSeats = numofSeats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="filght_id")
	private List<AirHosters> airhosterssessList;

	public List<AirHosters> getAirhosterssessList() {
		return airhosterssessList;
	}

	public void setAirhosterssessList(List<AirHosters> airhosterssessList) {
		this.airhosterssessList = airhosterssessList;
	}
	
	

	
}

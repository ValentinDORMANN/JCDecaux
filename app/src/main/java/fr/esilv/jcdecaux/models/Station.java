package fr.esilv.jcdecaux.models;

import java.io.Serializable;

public class Station {
	private int number;
	private String contract_name;
	private String name;
	private String address;
	private Position position;
	private boolean banking;
	private boolean bonus;
	private String status;
	private int bike_stands;
	private int available_bike_stands;
	private int available_bikes;
	private String last_update;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getContract_name() {
		return contract_name;
	}

	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean isBanking() {
		return banking;
	}

	public void setBanking(boolean banking) {
		this.banking = banking;
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBike_stands() {
		return bike_stands;
	}

	public void setBike_stands(int bike_stands) {
		this.bike_stands = bike_stands;
	}

	public int getAvailable_bike_stands() {
		return available_bike_stands;
	}

	public void setAvailable_bike_stands(int available_bike_stands) {
		this.available_bike_stands = available_bike_stands;
	}

	public int getAvailable_bikes() {
		return available_bikes;
	}

	public void setAvailable_bikes(int available_bikes) {
		this.available_bikes = available_bikes;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public class Position implements Serializable {
		private double lat;
		private double lng;

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}
	}
}

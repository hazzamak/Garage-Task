package com.qa.vehicles;

public class Car extends vehicles {
	
	private int doors;
	private String bootSize;
	private int seats;
	
	
	public void setdoors(int newdoors) {
		doors = newdoors;
	}
	public void getdoors() {
		System.out.println("you have " + doors + " number of doors.");
	}
	
	public void setbootSize(String newbootSize) {
		bootSize = newbootSize;
	}
	public void getbootSize() {
		System.out.println("you have a " + bootSize + " sized boot");
	}
	
	public void setseats(int newseats) {
		seats = newseats;
	}
	public void getseats() {
		System.out.println("you have " + seats + " seats.");
	}
}

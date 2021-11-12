package com.qa.vehicles;

public class vehicles {
	
	private int Wheels;
	private int Valves;
	public int Horsepower;
	public String vehicleType;
	public String vehicleName;
	public int index;
	
	
	public void setWheels(int newWheels) {
		Wheels = newWheels;
	}
	public void getWheels() {
		System.out.println("You have " + Wheels + " wheels.");
	}
	
	public void setValves(int newValves) {
		Valves = newValves;
	}
	public void getValves() {
		System.out.println("You have " + Valves + " valves.");
	}
	
	public void setHorsepower(int newHorsepower) {
		Horsepower = newHorsepower;
	}
	public void getHorsepower() {
		System.out.println("You have " + Horsepower + " horsepower.");
	}
	
	public void setvehicleType(String newvehicleType) {
		vehicleType = newvehicleType;
	}
	public void getvehicleType() {
		System.out.println("You have a " + vehicleType);
	}
	
	public void setvehicleName(String newvehicleName) {
		vehicleName = newvehicleName;
	}
	public void getvehicleName() {
		System.out.println("This vehicle is a " + vehicleName);
	}
	

	
}

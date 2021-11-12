package com.qa.garage;

import java.util.ArrayList;

import com.qa.vehicles.Car;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;
import com.qa.vehicles.vehicles;

public class Garage {

	ArrayList motorbikeList = new ArrayList();
	int bikenum = ((CharSequence) motorbikeList).length();
	ArrayList carList = new ArrayList();
	int carnum = ((CharSequence) carList).length();
	ArrayList vanList = new ArrayList();
	int vannum = ((CharSequence) vanList).length();
	
	public void addBike (Motorcycle bike) {
		this.motorbikeList.add(bike);
	}
	public void addcar(Car car) {
		this.carList.add(car);
	}
	public void addVan(Van van) {
		this.vanList.add(van);
	}
	
	public void removeBike(Motorcycle bike) {
		motorbikeList.remove(bike.index);
	}
	public void removecar(Car car) {
		carList.remove(car.index);
	}
	public void removevan(Van van) {
		vanList.remove(van.index);
	}
	
	public void getBikePrices() {
		for (int i = 0; i < bikenum; i++) {
			Motorcycle bike = (Motorcycle) motorbikeList.get(i);
			int price = bike.Horsepower;
			price = price*5;
			System.out.println("The price of " + bike.vehicleName + " is £" + price);
		}
	}
	public void getCarPrices() {
		for (int i = 0; i < carnum; i++) {
			Car car = (Car) carList.get(i);
			int price = car.Horsepower;
			price = price*5;
			System.out.println("The price of " + car.vehicleName + " is £" + price);
		}
	}
	public void getVanPrices() {
		for (int i = 0; i < vannum; i++) {
			Van van = (Van) vanList.get(i);
			int price = van.Horsepower;
			price = price*5;
			System.out.println("The price of " + van.vehicleName + " is £" + price);
		}
	}
	
	public void fixvehicle(vehicles vehicle) {
		int fixprice = vehicle.Horsepower*2;
		System.out.println("It will cost £" + fixprice + " to fix your " + vehicle.vehicleType);
	}
}

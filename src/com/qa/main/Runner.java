package com.qa.main;

import com.qa.garage.Garage;
import com.qa.vehicles.Car;
import com.qa.vehicles.Motorcycle;
import com.qa.vehicles.Van;

public class Runner {
	public static void main(String[] args) {
		Car VXL = new Car();
		Motorcycle LXMTO = new Motorcycle();
		Van VN = new Van();
		
		VXL.setHorsepower(200);
		LXMTO.setHorsepower(500);
		VN.setHorsepower(400);
		VXL.setvehicleType("car");
		LXMTO.setvehicleType("Motorcycle");
		VN.setvehicleType("Van");
		
		Garage g1 = new Garage();
		g1.addBike(LXMTO);
		g1.getBikePrices();
	}

}

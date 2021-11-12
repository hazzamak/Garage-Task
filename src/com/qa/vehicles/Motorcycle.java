package com.qa.vehicles;

public class Motorcycle extends vehicles {

	private boolean pillionPassenger;
	private boolean custom;
	private String type;
	
	
	public void setpillionPassenger(boolean newpillionPassenger) {
		pillionPassenger = newpillionPassenger;
	}
	public void getpillionPassenger() {
		if (pillionPassenger = true) {
			System.out.println("you have a pillion seat.");
		}else if (pillionPassenger = false) {
			System.out.println("you dont have a pillion seat");
		}else {
			System.out.println("you have not set this van perametre.");
		}
			
	}
	
	public void setcustom(boolean newcustom) {
		custom = newcustom;
	}
	public void getcustom() {
		if (custom = true) {
			System.out.println("you have custom bike.");
		}else if (custom = false) {
			System.out.println("you dont have a custom bike.");
		}else {
			System.out.println("you have not set this van perametre.");
		}
			
	}
	
	public void settype (String newtype) {
		type = newtype;
	}
	public void gettype() {
		System.out.println("you have a " + type + " type bike");
	}
}

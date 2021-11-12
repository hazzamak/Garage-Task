package com.qa.vehicles;

public class Van extends vehicles {
	
	private int carryWeight;
	private int vanSize;
	private boolean companyVan;
	
	
	public void setcarryWeight (int newcarryWeight) {
		carryWeight = newcarryWeight;
	}
	public void getcarryWeight() {
		System.out.println("your van can carry " + carryWeight + "kgs.");
	}
	
	public void setvanSize(int newvanSize) {
		vanSize = newvanSize;
	}
	public void getvanSize() {
		System.out.println("you have a van size " + vanSize + ".");
	}
	
	public void setcompanyVan(boolean newcompanyVan) {
		companyVan = newcompanyVan;
	}
	public void getcompanyVan() {
		if (companyVan = true) {
			System.out.println("you have company van.");
		}else if (companyVan = false) {
			System.out.println("you have a private van");
		}else {
			System.out.println("you have not set this van perametre.");
		}
			
	}
}

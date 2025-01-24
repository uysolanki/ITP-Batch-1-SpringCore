package com.itp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private int carModelYear;
	private String carColor;
	private String carModelName;
	private String carMfgName;
	
	@Autowired							//default byType
	@Qualifier("apple")                //byName
	private Engine e2;
	
	@Autowired							//default byType
	@Qualifier("banana") 
	private Gear gear;
	
	@Autowired
	private MusicSystem musicSystem;
	
	public Car() {}
	public Car(int carModelYear, String carColor, String carModelName, String carMfgName, Engine engine, Gear gear) {
		this.carModelYear = carModelYear;
		this.carColor = carColor;
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.e2 = engine;
		this.gear = gear;
	}

	
	public Car(int carModelYear, String carColor, String carModelName, String carMfgName) {
		this.carModelYear = carModelYear;
		this.carColor = carColor;
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
	}
	public int getCarModelYear() {
		return carModelYear;
	}

	public void setCarModelYear(int carModelYear) {
		this.carModelYear = carModelYear;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public String getCarMfgName() {
		return carMfgName;
	}

	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}

	public Engine getEngine() {
		return e2;
	}

	public void setEngine(Engine engine) {
		this.e2 = engine;
	}

	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}
	@Override
	public String toString() {
		return "Car [carModelYear=" + carModelYear + ", carColor=" + carColor + ", carModelName=" + carModelName
				+ ", carMfgName=" + carMfgName + ", e2=" + e2 + ", gear=" + gear + ", musicSystem=" + musicSystem + "]";
	}

	
	
	

}

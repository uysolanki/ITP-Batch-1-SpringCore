package com.itp.model;

public class Car {
	
	private int carModelYear;
	private String carColor;
	private String carModelName;
	private String carMfgName;
	
	private Engine engine;
	private Gear gear;
	
	public Car() {}
	public Car(int carModelYear, String carColor, String carModelName, String carMfgName, Engine engine, Gear gear) {
		this.carModelYear = carModelYear;
		this.carColor = carColor;
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.engine = engine;
		this.gear = gear;
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
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
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
				+ ", carMfgName=" + carMfgName + ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	

}

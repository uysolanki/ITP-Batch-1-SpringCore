package com.itp.model;

public class Gear {
	
	private int gearCount;
	private int gearMfgYear;
	private String gearColor;
	private String gearMfgName;
	
	public Gear() {}
	
	public Gear(int gearCount, int gearMfgYear, String gearColor, String gearMfgName) {
		System.out.println("Gear class Parameterised Constructor Called");
		this.gearCount = gearCount;
		this.gearMfgYear = gearMfgYear;
		this.gearColor = gearColor;
		this.gearMfgName = gearMfgName;
	}

	@Override
	public String toString() {
		return "Gear [gearCount=" + gearCount + ", gearMfgYear=" + gearMfgYear + ", gearColor=" + gearColor
				+ ", gearMfgName=" + gearMfgName + "]";
	}

	public int getGearCount() {
		return gearCount;
	}

	public void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}

	public int getGearMfgYear() {
		return gearMfgYear;
	}

	public void setGearMfgYear(int gearMfgYear) {
		this.gearMfgYear = gearMfgYear;
	}

	public String getGearColor() {
		return gearColor;
	}

	public void setGearColor(String gearColor) {
		this.gearColor = gearColor;
	}

	public String getGearMfgName() {
		return gearMfgName;
	}

	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
}

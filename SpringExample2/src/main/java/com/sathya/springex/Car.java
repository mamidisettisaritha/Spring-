package com.sathya.springex;

public  class Car implements Vehicle {
 private String fuelType;
 private int maxspeed;
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getMaxspeed() {
	return maxspeed;
}
public void setMaxspeed(int maxspeed) {
	this.maxspeed = maxspeed;
}
@Override
public void move() {
	System.out.println("your selected Car vehicle...");
	System.out.println("max speed..."+maxspeed);
	System.out.println("Fuel type..."+fuelType);
}
}

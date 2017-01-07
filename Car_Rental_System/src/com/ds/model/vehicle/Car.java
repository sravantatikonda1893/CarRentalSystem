package com.ds.model.vehicle;

import java.util.Date;

import com.ds.model.places.Branch;

public class Car {
private int carId;
private String carName;
private String regNumber;
private Date dateAdded;
private Date modelYear;
//many-to-one relation(many cars can have one car type )
private CarType carType;
//Many-to-One(many cars can have same fuel type)
private FuelType fuelType;
private byte availability_flag;
//many-to-one (many cars can have same branch)
private Branch branch;
public Car() {
}
public Car(int carId, String carName, String regNumber, Date dateAdded, Date modelYear, CarType carType,
		FuelType fuelType, byte availability_flag, Branch branch) {
	super();
	this.carId = carId;
	this.carName = carName;
	this.regNumber = regNumber;
	this.dateAdded = dateAdded;
	this.modelYear = modelYear;
	this.carType = carType;
	this.fuelType = fuelType;
	this.availability_flag = availability_flag;
	this.branch = branch;
}
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public String getRegNumber() {
	return regNumber;
}
public void setRegNumber(String regNumber) {
	this.regNumber = regNumber;
}
public Date getDateAdded() {
	return dateAdded;
}
public void setDateAdded(Date dateAdded) {
	this.dateAdded = dateAdded;
}
public Date getModelYear() {
	return modelYear;
}
public void setModelYear(Date modelYear) {
	this.modelYear = modelYear;
}
public CarType getCarType() {
	return carType;
}
public void setCarType(CarType carType) {
	this.carType = carType;
}
public FuelType getFuelType() {
	return fuelType;
}
public void setFuelType(FuelType fuelType) {
	this.fuelType = fuelType;
}
public byte getAvailability_flag() {
	return availability_flag;
}
public void setAvailability_flag(byte availability_flag) {
	this.availability_flag = availability_flag;
}
public Branch getBranch() {
	return branch;
}
public void setBranch(Branch branch) {
	this.branch = branch;
}

}

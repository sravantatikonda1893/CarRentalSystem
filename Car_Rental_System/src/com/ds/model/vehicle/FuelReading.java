package com.ds.model.vehicle;

import java.util.Date;

public class FuelReading {
private int fuelReadingId;
private Date readingDate;
private Date readingTime;
private int reading;
private int version;
//many-to-one relation(many records in fuelreading table has same carid)
private Car car;
public FuelReading() {
}
public FuelReading(int fuelReadingId, Date readingDate, Date readingTime, int reading, int version, Car car) {
	super();
	this.fuelReadingId = fuelReadingId;
	this.readingDate = readingDate;
	this.readingTime = readingTime;
	this.reading = reading;
	this.version = version;
	this.car = car;
}
public int getFuelReadingId() {
	return fuelReadingId;
}
public void setFuelReadingId(int fuelReadingId) {
	this.fuelReadingId = fuelReadingId;
}
public Date getReadingDate() {
	return readingDate;
}
public void setReadingDate(Date readingDate) {
	this.readingDate = readingDate;
}
public Date getReadingTime() {
	return readingTime;
}
public void setReadingTime(Date readingTime) {
	this.readingTime = readingTime;
}
public int getReading() {
	return reading;
}
public void setReading(int reading) {
	this.reading = reading;
}
public int getVersion() {
	return version;
}
public void setVersion(int version) {
	this.version = version;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}

}

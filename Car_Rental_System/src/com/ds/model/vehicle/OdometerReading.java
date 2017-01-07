package com.ds.model.vehicle;

import java.util.Date;

public class OdometerReading {
	private int odometerReadingId;
	private Date readingDate;
	private Date readingTime;
	private int reading;
	private int version;
//many-to-one(many records in car table can have same odometer reading  in its table)
	private Car car;
public OdometerReading() {
}
public OdometerReading(int odometerReadingId, Date readingDate, Date readingTime, int reading, int version, Car car) {
	super();
	this.odometerReadingId = odometerReadingId;
	this.readingDate = readingDate;
	this.readingTime = readingTime;
	this.reading = reading;
	this.version = version;
	this.car = car;
}
public int getOdometerReadingId() {
	return odometerReadingId;
}
public void setOdometerReadingId(int odometerReadingId) {
	this.odometerReadingId = odometerReadingId;
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

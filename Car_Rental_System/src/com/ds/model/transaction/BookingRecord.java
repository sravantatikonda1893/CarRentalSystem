package com.ds.model.transaction;

import java.util.Date;

import com.ds.model.places.Location;
import com.ds.model.usermodel.User;
import com.ds.model.vehicle.Car;

public class BookingRecord {
private int bookingId;
private Location source;
private Location destination;
private User user;
private Car car;
private Timesheet timesheet;
private Date dateOfJourney;
private int distance;
private int noOfPassengers;
private byte driverFlag;
private byte confirmationFlag;
public BookingRecord() {
}

public BookingRecord(int bookingId, Location source, Location destination, User user, Car car, Timesheet timesheet,
		Date dateOfJourney, int distance, int noOfPassengers, byte driverFlag, byte confirmationFlag) {
	super();
	this.bookingId = bookingId;
	this.source = source;
	this.destination = destination;
	this.user = user;
	this.car = car;
	this.timesheet = timesheet;
	this.dateOfJourney = dateOfJourney;
	this.distance = distance;
	this.noOfPassengers = noOfPassengers;
	this.driverFlag = driverFlag;
	this.confirmationFlag = confirmationFlag;
}

public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public Location getSource() {
	return source;
}
public void setSource(Location source) {
	this.source = source;
}
public Location getDestination() {
	return destination;
}
public void setDestination(Location destination) {
	this.destination = destination;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Timesheet getTimesheet() {
	return timesheet;
}
public void setTimesheet(Timesheet timesheet) {
	this.timesheet = timesheet;
}
public Date getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(Date dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public int getNoOfPassengers() {
	return noOfPassengers;
}
public void setNoOfPassengers(int noOfPassengers) {
	this.noOfPassengers = noOfPassengers;
}
public byte getDriverFlag() {
	return driverFlag;
}
public void setDriverFlag(byte driverFlag) {
	this.driverFlag = driverFlag;
}
public byte getConfirmationFlag() {
	return confirmationFlag;
}
public void setConfirmationFlag(byte confirmationFlag) {
	this.confirmationFlag = confirmationFlag;
}

}

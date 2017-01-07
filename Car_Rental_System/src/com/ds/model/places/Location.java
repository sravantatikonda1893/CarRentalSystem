package com.ds.model.places;

public class Location {
private int locationId;
private String street;
private String city;
private String state;
private String zipcode;
public Location() {
}
public Location(int locationId, String street, String city, String state, String zipcode) {
	super();
	this.locationId = locationId;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
}
public int getLocationId() {
	return locationId;
}
public void setLocationId(int locationId) {
	this.locationId = locationId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
 }

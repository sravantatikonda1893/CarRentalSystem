package com.ds.model.usermodel;

public class Address {
private String email;
private String mobile;
private String street;
private String city;
private String state;
private String country;
private String zipcode;

public Address() {
}
public String getEmail() {
	return email;
}
public Address(String email, String mobile, String street, String city, String state, String country, String zipcode) {
	super();
	this.email = email;
	this.mobile = mobile;
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
	this.zipcode = zipcode;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

}

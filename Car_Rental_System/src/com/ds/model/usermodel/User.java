package com.ds.model.usermodel;

import java.util.Date;
import java.util.Set;

public class User {
private int userId;
 private String userName;
 private String password;
 private Date dob;
 private String gender;
//One-to-many relation
 private Set<Address> addresses;
 
public User() {
}
public int getUserId() {
	return userId;
}
public User(int userId, String userName, String password, Date dob, String gender, Set<Address> addresses) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.password = password;
	this.dob = dob;
	this.gender = gender;
	this.addresses = addresses;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Set<Address> getAddresses() {
	return addresses;
}
public void setAddress(Set<Address> addresses) {
	this.addresses = addresses;
}
 
 
}

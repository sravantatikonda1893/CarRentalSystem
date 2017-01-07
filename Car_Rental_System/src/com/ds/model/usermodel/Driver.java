package com.ds.model.usermodel;

import java.util.Date;

import com.ds.model.places.Branch;

public class Driver extends Employee{
	private String licenseId;
public Driver() {
}
public Driver(String licenseId) {
	super();
	this.licenseId = licenseId;
}
public String getLicenseId() {
	return licenseId;
}
public void setLicenseId(String licenseId) {
	this.licenseId = licenseId;
}
}

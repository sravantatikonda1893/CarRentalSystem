package com.ds.model.payment;

import java.util.Date;

import com.ds.model.vehicle.Car;

public class Insurance {
private int insuranceId;
//Many-to-One(Many records in insurance table can have same car-could be for renewal)
private Car car;
private String companyName;
private double amount;
private Date renewDate;
private String version;//how many times taken for that vehicle
//Many-to-One(Many insurances can have same type)
private InsuranceType insuranceType;
public Insurance() {
}
public Insurance(int insuranceId, Car car, String companyName, double amount, Date renewDate, String version,
		InsuranceType insuranceType) {
	super();
	this.insuranceId = insuranceId;
	this.car = car;
	this.companyName = companyName;
	this.amount = amount;
	this.renewDate = renewDate;
	this.version = version;
	this.insuranceType = insuranceType;
}
public int getInsuranceId() {
	return insuranceId;
}
public void setInsuranceId(int insuranceId) {
	this.insuranceId = insuranceId;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Date getRenewDate() {
	return renewDate;
}
public void setRenewDate(Date renewDate) {
	this.renewDate = renewDate;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public InsuranceType getInsuranceType() {
	return insuranceType;
}
public void setInsuranceType(InsuranceType insuranceType) {
	this.insuranceType = insuranceType;
}
}

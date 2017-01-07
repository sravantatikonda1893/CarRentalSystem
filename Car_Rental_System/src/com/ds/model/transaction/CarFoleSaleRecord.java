package com.ds.model.transaction;

import java.util.Date;

import com.ds.model.vehicle.Car;

public class CarFoleSaleRecord {
private int carForSaleId;
private Date dateOfAdd;
private String branchLoc;
private double saleprice;
private int odoReading;
//one-to-one
private Car car;
public CarFoleSaleRecord() {
}
public int getCarForSaleId() {
	return carForSaleId;
}
public CarFoleSaleRecord(int carForSaleId, Date dateOfAdd, String branchLoc, double saleprice, int odoReading,
		Car car) {
	super();
	this.carForSaleId = carForSaleId;
	this.dateOfAdd = dateOfAdd;
	this.branchLoc = branchLoc;
	this.saleprice = saleprice;
	this.odoReading = odoReading;
	this.car = car;
}
public void setCarForSaleId(int carForSaleId) {
	this.carForSaleId = carForSaleId;
}
public Date getDateOfAdd() {
	return dateOfAdd;
}
public void setDateOfAdd(Date dateOfAdd) {
	this.dateOfAdd = dateOfAdd;
}
public String getBranchLoc() {
	return branchLoc;
}
public void setBranchLoc(String branchLoc) {
	this.branchLoc = branchLoc;
}
public double getSaleprice() {
	return saleprice;
}
public void setSaleprice(double saleprice) {
	this.saleprice = saleprice;
}
public int getOdoReading() {
	return odoReading;
}
public void setOdoReading(int odoReading) {
	this.odoReading = odoReading;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
}

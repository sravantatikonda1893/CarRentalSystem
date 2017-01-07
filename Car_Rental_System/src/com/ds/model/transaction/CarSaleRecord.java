package com.ds.model.transaction;

import java.util.Date;

import com.ds.model.payment.Payment;
import com.ds.model.usermodel.User;

public class CarSaleRecord {
private int carSaleId;
private User user;
private Payment payment;
private Date dateOfSale;
//this is one-to-one relation
private CarFoleSaleRecord carForSaleRecord;
public CarSaleRecord() {
}

public CarSaleRecord(int carSaleId, User user, Payment payment, Date dateOfSale, CarFoleSaleRecord carForSaleRecord) {
	super();
	this.carSaleId = carSaleId;
	this.user = user;
	this.payment = payment;
	this.dateOfSale = dateOfSale;
	this.carForSaleRecord = carForSaleRecord;
}

public int getCarSaleId() {
	return carSaleId;
}
public void setCarSaleId(int carSaleId) {
	this.carSaleId = carSaleId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public Date getDateOfSale() {
	return dateOfSale;
}
public void setDateOfSale(Date dateOfSale) {
	this.dateOfSale = dateOfSale;
}
public CarFoleSaleRecord getCarForSaleRecord() {
	return carForSaleRecord;
}
public void setCarForSaleRecord(CarFoleSaleRecord carForSaleRecord) {
	this.carForSaleRecord = carForSaleRecord;
}

}

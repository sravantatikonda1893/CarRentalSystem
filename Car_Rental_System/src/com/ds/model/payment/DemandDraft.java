package com.ds.model.payment;

import java.util.Date;

public class DemandDraft {
private int ddNumber;
private String bank;
private String branch;
private double amount;
private Date depositDate;
private Date expiryDate;
//many-to-one(many recors in dd table can have same payment id- payment with multiple dd's)
private int paymentId;
public DemandDraft() {
}
public DemandDraft(int ddNumber, String bank, String branch, double amount, Date depositDate, Date expiryDate,
		int paymentId) {
	super();
	this.ddNumber = ddNumber;
	this.bank = bank;
	this.branch = branch;
	this.amount = amount;
	this.depositDate = depositDate;
	this.expiryDate = expiryDate;
	this.paymentId = paymentId;
}
public int getDdNumber() {
	return ddNumber;
}
public void setDdNumber(int ddNumber) {
	this.ddNumber = ddNumber;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Date getDepositDate() {
	return depositDate;
}
public void setDepositDate(Date depositDate) {
	this.depositDate = depositDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}

}

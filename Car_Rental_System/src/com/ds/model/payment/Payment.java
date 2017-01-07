package com.ds.model.payment;

import java.util.Date;

public class Payment {
private int paymentId;
//many-to-one relation(Many payments can have same payment type)
private PaymentType paymentType;
private Date txTime;
private double amount;
public Payment() {
}
public Payment(int paymentId, PaymentType paymentType, Date txTime, double amount) {
	super();
	this.paymentId = paymentId;
	this.paymentType = paymentType;
	this.txTime = txTime;
	this.amount = amount;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public PaymentType getPaymentType() {
	return paymentType;
}
public void setPaymentType(PaymentType paymentType) {
	this.paymentType = paymentType;
}
public Date getTxTime() {
	return txTime;
}
public void setTxTime(Date txTime) {
	this.txTime = txTime;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}}


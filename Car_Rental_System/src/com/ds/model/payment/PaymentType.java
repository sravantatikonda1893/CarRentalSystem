package com.ds.model.payment;

public class PaymentType {
private int paymentTypeId;
private String paymentTypeDesc;
public PaymentType() {
}
public PaymentType(int paymentTypeId, String paymentTypeDesc) {
	super();
	this.paymentTypeId = paymentTypeId;
	this.paymentTypeDesc = paymentTypeDesc;
}
public int getPaymentTypeId() {
	return paymentTypeId;
}
public void setPaymentTypeId(int paymentTypeId) {
	this.paymentTypeId = paymentTypeId;
}
public String getPaymentTypeDesc() {
	return paymentTypeDesc;
}
public void setPaymentTypeDesc(String paymentTypeDesc) {
	this.paymentTypeDesc = paymentTypeDesc;
}

}

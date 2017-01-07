package com.ds.model.payment;

import java.util.Date;

public class Coupon {
private int couponId;
private Date expDate;
private int minAmount;
private int maxAmount;
private double discount;

public Coupon() {
}

public Coupon(int couponId, Date expDate, int minAmount, int maxAmount, double discount) {
	super();
	this.couponId = couponId;
	this.expDate = expDate;
	this.minAmount = minAmount;
	this.maxAmount = maxAmount;
	this.discount = discount;
}

public int getCouponId() {
	return couponId;
}

public void setCouponId(int couponId) {
	this.couponId = couponId;
}

public Date getExpDate() {
	return expDate;
}

public void setExpDate(Date expDate) {
	this.expDate = expDate;
}

public int getMinAmount() {
	return minAmount;
}

public void setMinAmount(int minAmount) {
	this.minAmount = minAmount;
}

public int getMaxAmount() {
	return maxAmount;
}

public void setMaxAmount(int maxAmount) {
	this.maxAmount = maxAmount;
}

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}
}

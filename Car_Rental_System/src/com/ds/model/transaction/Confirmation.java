package com.ds.model.transaction;

import com.ds.model.payment.Payment;

public class Confirmation {
private int confirmCancelId;
//One-to-One relation
private BookingRecord bookingRecord;
//one-to-one relation(each record in confirmation table should have unique payment id)
private Payment payment;
//1-confirmed, 2-cancel, 3-return
private byte confirmCancRetu_flag;
public Confirmation() {
}

public Confirmation(int confirmCancelId, BookingRecord bookingRecord, Payment payment, byte confirmCancRetu_flag) {
	super();
	this.confirmCancelId = confirmCancelId;
	this.bookingRecord = bookingRecord;
	this.payment = payment;
	this.confirmCancRetu_flag = confirmCancRetu_flag;
}

public int getConfirmCancelId() {
	return confirmCancelId;
}
public void setConfirmCancelId(int confirmCancelId) {
	this.confirmCancelId = confirmCancelId;
}
public BookingRecord getBookingRecord() {
	return bookingRecord;
}
public void setBookingRecord(BookingRecord bookingRecord) {
	this.bookingRecord = bookingRecord;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public byte getConfirmCancRetu_flag() {
	return confirmCancRetu_flag;
}
public void setConfirmCancRetu_flag(byte confirmCancRetu_flag) {
	this.confirmCancRetu_flag = confirmCancRetu_flag;
}
}

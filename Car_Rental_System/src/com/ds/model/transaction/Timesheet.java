package com.ds.model.transaction;

import java.util.Date;

public class Timesheet {
private int timeSheetId;
private Date fromDate;
private Date toDate;
private Date fromTime;
private Date toTime;
public Timesheet() {
}
public Timesheet(int timeSheetId, Date fromDate, Date toDate, Date fromTime, Date toTime) {
	super();
	this.timeSheetId = timeSheetId;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.fromTime = fromTime;
	this.toTime = toTime;
}
public int getTimeSheetId() {
	return timeSheetId;
}
public void setTimeSheetId(int timeSheetId) {
	this.timeSheetId = timeSheetId;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
public Date getFromTime() {
	return fromTime;
}
public void setFromTime(Date fromTime) {
	this.fromTime = fromTime;
}
public Date getToTime() {
	return toTime;
}
public void setToTime(Date toTime) {
	this.toTime = toTime;
}

}

package com.ds.model.payment;

import com.ds.model.vehicle.CarType;

public class VehicleCharges {
private int vehicleChargeId;
//one-to-one relation 
private CarType carType;
private double hr_c_P_d;
private double hr_c_P_n;
private double day_c;
private double night_c;
private double week_c;
private double month_c;
private double extra_c_p_KM;
private double extra_c_p_Min;
public VehicleCharges() {
}
public VehicleCharges(int vehicleChargeId, CarType carType, double hr_c_P_d, double hr_c_P_n, double day_c,
		double night_c, double week_c, double month_c, double extra_c_p_KM, double extra_c_p_Min) {
	super();
	this.vehicleChargeId = vehicleChargeId;
	this.carType = carType;
	this.hr_c_P_d = hr_c_P_d;
	this.hr_c_P_n = hr_c_P_n;
	this.day_c = day_c;
	this.night_c = night_c;
	this.week_c = week_c;
	this.month_c = month_c;
	this.extra_c_p_KM = extra_c_p_KM;
	this.extra_c_p_Min = extra_c_p_Min;
}
public int getVehicleChargeId() {
	return vehicleChargeId;
}
public void setVehicleChargeId(int vehicleChargeId) {
	this.vehicleChargeId = vehicleChargeId;
}
public CarType getCarType() {
	return carType;
}
public void setCarType(CarType carType) {
	this.carType = carType;
}
public double getHr_c_P_d() {
	return hr_c_P_d;
}
public void setHr_c_P_d(double hr_c_P_d) {
	this.hr_c_P_d = hr_c_P_d;
}
public double getHr_c_P_n() {
	return hr_c_P_n;
}
public void setHr_c_P_n(double hr_c_P_n) {
	this.hr_c_P_n = hr_c_P_n;
}
public double getDay_c() {
	return day_c;
}
public void setDay_c(double day_c) {
	this.day_c = day_c;
}
public double getNight_c() {
	return night_c;
}
public void setNight_c(double night_c) {
	this.night_c = night_c;
}
public double getWeek_c() {
	return week_c;
}
public void setWeek_c(double week_c) {
	this.week_c = week_c;
}
public double getMonth_c() {
	return month_c;
}
public void setMonth_c(double month_c) {
	this.month_c = month_c;
}
public double getExtra_c_p_KM() {
	return extra_c_p_KM;
}
public void setExtra_c_p_KM(double extra_c_p_KM) {
	this.extra_c_p_KM = extra_c_p_KM;
}
public double getExtra_c_p_Min() {
	return extra_c_p_Min;
}
public void setExtra_c_p_Min(double extra_c_p_Min) {
	this.extra_c_p_Min = extra_c_p_Min;
}
}

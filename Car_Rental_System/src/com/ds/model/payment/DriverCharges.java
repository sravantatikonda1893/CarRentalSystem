package com.ds.model.payment;



public class DriverCharges {
	private int driverChargeId;
	private double hr_c_P_d;
	private double hr_c_P_n;
	private double day_c;
	private double night_c;
	private double week_c;
	private double month_c;
	private double wait_c_p_Min;
public DriverCharges() {
}
public DriverCharges(int driverChargeId, double hr_c_P_d, double hr_c_P_n, double day_c, double night_c, double week_c,
		double month_c, double wait_c_p_Min) {
	super();
	this.driverChargeId = driverChargeId;
	this.hr_c_P_d = hr_c_P_d;
	this.hr_c_P_n = hr_c_P_n;
	this.day_c = day_c;
	this.night_c = night_c;
	this.week_c = week_c;
	this.month_c = month_c;
	this.wait_c_p_Min = wait_c_p_Min;
}
public int getDriverChargeId() {
	return driverChargeId;
}
public void setDriverChargeId(int driverChargeId) {
	this.driverChargeId = driverChargeId;
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
public double getWait_c_p_Min() {
	return wait_c_p_Min;
}
public void setWait_c_p_Min(double wait_c_p_Min) {
	this.wait_c_p_Min = wait_c_p_Min;
}

}

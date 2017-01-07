package com.ds.model.vehicle;

public class CarType {
	private int carTypeId;
	private String carTypeName;
	private String carTypeDesc;
	public CarType() {
	}
	public CarType(int carTypeId, String carTypeName, String carTypeDesc) {
		super();
		this.carTypeId = carTypeId;
		this.carTypeName = carTypeName;
		this.carTypeDesc = carTypeDesc;
	}
	public int getCarTypeId() {
		return carTypeId;
	}
	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}
	public String getCarTypeName() {
		return carTypeName;
	}
	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}
	public String getCarTypeDesc() {
		return carTypeDesc;
	}
	public void setCarDesc(String carTypeDesc) {
		this.carTypeDesc = carTypeDesc;
	}

}

package com.ds.model.vehicle;

public class FuelType {
private int fuelTypeId;
private String fuelTypeName;
private String fuelTypeDesc;
public FuelType() {
}
public FuelType(int fuelTypeId, String fuelTypeName, String fuelTypeDesc) {
	super();
	this.fuelTypeId = fuelTypeId;
	this.fuelTypeName = fuelTypeName;
	this.fuelTypeDesc = fuelTypeDesc;
}
public int getFuelTypeId() {
	return fuelTypeId;
}
public void setFuelTypeId(int fuelTypeId) {
	this.fuelTypeId = fuelTypeId;
}
public String getFuelTypeName() {
	return fuelTypeName;
}
public void setFuelTypeName(String fuelTypeName) {
	this.fuelTypeName = fuelTypeName;
}
public String getFuelTypeDesc() {
	return fuelTypeDesc;
}
public void setFuelTypeDesc(String fuelTypeDesc) {
	this.fuelTypeDesc = fuelTypeDesc;
}

}

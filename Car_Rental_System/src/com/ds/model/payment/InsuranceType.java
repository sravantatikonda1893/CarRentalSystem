package com.ds.model.payment;

public class InsuranceType {
private int insuranceTypeId;
private String insuranceTypeDesc;
public InsuranceType() {
}
public InsuranceType(int insuranceTypeId, String insuranceTypeDesc) {
	super();
	this.insuranceTypeId = insuranceTypeId;
	this.insuranceTypeDesc = insuranceTypeDesc;
}
public int getInsuranceTypeId() {
	return insuranceTypeId;
}
public void setInsuranceTypeId(int insuranceTypeId) {
	this.insuranceTypeId = insuranceTypeId;
}
public String getInsuranceTypeDesc() {
	return insuranceTypeDesc;
}
public void setInsuranceTypeDesc(String insuranceTypeDesc) {
	this.insuranceTypeDesc = insuranceTypeDesc;
}
}

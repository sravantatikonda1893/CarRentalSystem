package com.ds.model.places;

public class Branch {
private int branchId;
private String name;
private String contact;
private String faxNumber;;
public Branch() {
}
public Branch(int branchId, String name, String contact, String faxNumber) {
	super();
	this.branchId = branchId;
	this.name = name;
	this.contact = contact;
	this.faxNumber = faxNumber;
}
public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getFaxNumber() {
	return faxNumber;
}
public void setFaxNumber(String faxNumber) {
	this.faxNumber = faxNumber;
}

}

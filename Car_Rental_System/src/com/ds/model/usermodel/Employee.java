package com.ds.model.usermodel;

import java.util.Date;

import com.ds.model.places.Branch;

public class Employee extends User{
private Date joinDdate;
private String role;
private Branch branch;
public Employee() {
}
public Employee(Date joinDdate, String role, Branch branch) {
	super();
	this.joinDdate = joinDdate;
	this.role = role;
	this.branch = branch;
}
public Date getJoinDdate() {
	return joinDdate;
}
public void setJoinDdate(Date joinDdate) {
	this.joinDdate = joinDdate;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Branch getBranch() {
	return branch;
}
public void setBranch(Branch branch) {
	this.branch = branch;
}

}

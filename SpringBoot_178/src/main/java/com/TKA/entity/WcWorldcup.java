package com.TKA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WcWorldcup {
	
	@Id
	int staffId;
	String staffName;
	String staffDept;
	int age;
	int NoofYeartoBcci;
	public WcWorldcup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WcWorldcup(int staffId, String staffName, String staffDept, int age, int noofYeartoBcci) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.age = age;
		NoofYeartoBcci = noofYeartoBcci;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoofYeartoBcci() {
		return NoofYeartoBcci;
	}
	public void setNoofYeartoBcci(int noofYeartoBcci) {
		NoofYeartoBcci = noofYeartoBcci;
	}
	@Override
	public String toString() {
		return "WcWorldcup [staffId=" + staffId + ", staffName=" + staffName + ", staffDept=" + staffDept + ", age="
				+ age + ", NoofYeartoBcci=" + NoofYeartoBcci + "]";
	}
	

}

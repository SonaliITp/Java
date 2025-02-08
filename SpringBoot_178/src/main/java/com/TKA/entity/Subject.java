package com.TKA.entity;

public class Subject {
	
	int subId;
	String subName;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + "]";
	}
	

}

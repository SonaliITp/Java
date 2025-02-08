package com.TKA.entity;

import java.util.List;

public class Faculty {
	
	int facultyId;
	String facultyName;
	int exp;
	int sal;
	List<Subject> subNames ;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int facultyId, String facultyName, int exp, int sal, List<Subject> subNames) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.exp = exp;
		this.sal = sal;
		this.subNames = subNames;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public List<Subject> getSubNames() {
		return subNames;
	}
	public void setSubNames(List<Subject> subNames) {
		this.subNames = subNames;
	}
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", exp=" + exp + ", sal=" + sal
				+ ", subNames=" + subNames + "]";
	}
	
	

}

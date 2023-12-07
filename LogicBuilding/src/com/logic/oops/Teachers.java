package com.logic.oops;

import java.util.Arrays;

public class Teachers extends School{
	
	private int id;
	private String name;
	private String address;
	private String subjectTeaching;
	private String teachToDivisions;
	
	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teachers(int id, String name, String address, String subjectTeaching, String teachToDivisions) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.subjectTeaching = subjectTeaching;
		this.teachToDivisions = teachToDivisions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSubjectTeaching() {
		return subjectTeaching;
	}

	public void setSubjectTeaching(String subjectTeaching) {
		this.subjectTeaching = subjectTeaching;
	}

	public String getTeachToDivisions() {
		return teachToDivisions;
	}

	public void setTeachToDivisions(String teachToDivisions) {
		this.teachToDivisions = teachToDivisions;
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + ", address=" + address + ", subjectTeaching=" + subjectTeaching
				+ ", teachToDivisions=" + teachToDivisions + "]";
	}

	
	
	
}

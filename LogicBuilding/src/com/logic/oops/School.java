package com.logic.oops;

import java.util.Arrays;

public class School {
	
	private String name;
	private String divison;
	private String[] subjects;
	private String schoolTiming;
	private int totalClass;
	private String medium;
	private int totalStudents;
	private int totalFloor;
	private Student details;
	private Teachers info;
	
	public School() {
		super();
	}

	public School(String name, String divison, String[] subjects, String schoolTiming, int totalClass,
			String medium, int totalStudents, int totalFloor, Student details, Teachers info) {
		super();
		this.name = name;
		this.divison = divison;
		this.subjects = subjects;
		this.schoolTiming = schoolTiming;
		this.totalClass = totalClass;
		this.medium = medium;
		this.totalStudents = totalStudents;
		this.totalFloor = totalFloor;
		this.details = details;
		this.info = info;
	}

	public String getSchoolTiming() {
		return schoolTiming;
	}

	public void setSchoolTiming(String schoolTiming) {
		this.schoolTiming = schoolTiming;
	}

	public String getDivison() {
		return divison;
	}

	public void setDivison(String divison) {
		this.divison = divison;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public int getTotalClass() {
		return totalClass;
	}

	public void setTotalClass(int totalClass) {
		this.totalClass = totalClass;
	}

	public int getTotalFloor() {
		return totalFloor;
	}

	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public Student getDetails() {
		return details;
	}

	public void setDetails(Student details) {
		this.details = details;
	}

	public Teachers getInfo() {
		return info;
	}

	public void setInfo(Teachers info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", divison=" + divison + ", subjects=" + Arrays.toString(subjects)
				+ ", schoolTiming=" + schoolTiming + ", totalClass=" + totalClass + ", medium=" + medium
				+ ", totalStudents=" + totalStudents + ", totalFloor=" + totalFloor  + ", details="
				+ details + ", info=" + info + "]";
	}
	
	

}

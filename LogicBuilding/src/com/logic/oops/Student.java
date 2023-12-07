package com.logic.oops;

public class Student extends School{
	
	private int id;
	private String name;
	private String address;
	private String division;
	private String standard;
	private double fees;
	private boolean isPresent;
	private boolean isFeesPayed;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String address, String division, String standard, double fees, boolean isPresent,
			boolean isFeesPayed) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.division = division;
		this.standard = standard;
		this.fees = fees;
		this.isPresent = isPresent;
		this.isFeesPayed = isFeesPayed;
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
	
	public String getDivision() {
		return division;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
	
	public String getStandard() {
		return standard;
	}
	
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public boolean isPresent() {
		return isPresent;
	}
	
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	
	public boolean isFeesPayed() {
		return isFeesPayed;
	}
	
	public void setFeesPayed(boolean isFeesPayed) {
		this.isFeesPayed = isFeesPayed;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", division=" + division
				+ ", standard=" + standard + ", fees=" + fees + ", isPresent=" + isPresent + ", isFeesPayed="
				+ isFeesPayed + "]";
	}
	
	
	
}

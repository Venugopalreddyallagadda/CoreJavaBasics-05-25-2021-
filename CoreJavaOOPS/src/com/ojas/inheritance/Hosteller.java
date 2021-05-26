package com.ojas.inheritance;

public class Hosteller extends Student{

	double hostelFee;

	public Hosteller() {
		super();
	}
	
	public Hosteller(int studentId,String sName, double examFee, double hostelFee) {
		super(studentId, sName, examFee);
		this.hostelFee = hostelFee;
	}
	
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", sName=" + sName + ", examFee="
				+ examFee + "]";
	}
	
	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", sName=" + sName + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount) {
		return hostelFee + examFee - amount;

	}

}

package com.ojas.inheritance;

public class Student {
	int studentId;
	String sName;
	double examFee;
	
	public Student() {
		super();
	}

	public Student(int studentId, String sName, double examFee) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.examFee = examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}
	
	public String displayDetails() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", examFee=" + examFee + "]";
	}
	
	public double payFee(double amount) {
		return examFee-amount;
		
	}
	
	
	
	
	
	

}

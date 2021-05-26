package com.ojas.abstractclass;

public abstract class Student {
	public String studentName;
	public String studentClass;
	protected static int totalNoOfStudents;
	
   Student() {
		
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	public abstract double getPercentage(); 
	static int  getTotalNoOfStudents() {
		return totalNoOfStudents;
		
	}

}

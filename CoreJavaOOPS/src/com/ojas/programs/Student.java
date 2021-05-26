package com.ojas.programs;

public class Student {
	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	
	public Student(int studentId, String studentName, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	}
	
	public String displayDetails() {

		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", grade="
				+ grade + "]";
	}

	private void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80 && marks <= 90) {
			grade = 'B';
		} else if (marks > 70 && marks <= 80) {
			grade = 'C';
		} else if (marks > 60 && marks <= 70) {
			grade = 'D';
		} else if (marks < 60) {
			grade = 'E';

		}
	}

	public static void main(String[] args) {
		Student std = new Student(1,"venu",80);
		System.out.println(std.displayDetails());
		
	}
	

}
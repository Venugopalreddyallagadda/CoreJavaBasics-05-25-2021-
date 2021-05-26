package com.ojas.abstractclass;


public class ScienceStudent extends Student{
	
	int physcisMarks;
	int chemistryMarks;
	int MathsMarks;
	
	
	public ScienceStudent() {
		super();
	}

	public ScienceStudent(int physcisMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.physcisMarks = physcisMarks;
		this.chemistryMarks = chemistryMarks;
		MathsMarks = mathsMarks;
	}

	
	@Override
	public double getPercentage() {
		int total = physcisMarks+chemistryMarks+MathsMarks;
		
		double percentage = (total/3);

		
		return percentage;
	}
}

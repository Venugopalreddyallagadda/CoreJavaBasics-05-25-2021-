package com.ojas.abstractclass;

public class HistoryStudent extends Student{
	int historyMarks;
	int civisMarks;
	
	public HistoryStudent() {
		super();
	}

	public HistoryStudent(int historyMarks, int civisMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civisMarks = civisMarks;
	}

	@Override
	public double getPercentage() {
		int total = historyMarks+civisMarks;
		//int sum = total/2;
		int percentage = total/2;
		return percentage;
	}
}
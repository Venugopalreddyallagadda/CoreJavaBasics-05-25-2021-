package com.ojas.abstractclass;

public class Test {
	public static void main(String[] args) {
		Student s = new ScienceStudent(40,80,10);
		
		System.out.println(s.getPercentage());
		
		
		Student s1 = new HistoryStudent(20,50);
		System.out.println(s1.getPercentage());
	}

}

package com.ojas.inheritance;

public class InheritanceTester {

	public static void main(String[] args) {
		Student s = new DayScholar(1,"venu",400,200);
		System.out.println(s.displayDetails());
		
		System.out.println(s.payFee(1000));
		
		
		Student s2 = new Hosteller(2, "gopal",300,200);
		System.out.println(s2.displayDetails());
		
		System.out.println(s2.payFee(2000));


	}

}

package com.ojas.employee.inheritance;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager("venu", 101, 25000, ManagerType.HR);
		System.out.println(manager.toString());
		clerk clerk = new clerk("gopal", 103, 2500, 70, 80);
		System.out.println(clerk.toString());
		clerk.setAccuracy(90);
		clerk.setSalary();
		System.out.println(clerk.toString());

	}

}

package com.ojas.encapsulation;

public class CheckAccCustomer {

	public static void main(String[] args) {
		Account acc = new Account();
		Customer cust = new Customer("venu","gopal");
		
		acc.setAccountNo(1234);
		acc.setInterestRate(2.0f);
		acc.deposit(3000);
		acc.withDraw(1000);
		
		System.out.println(acc);
		System.out.println(cust);
				
	
	}

}

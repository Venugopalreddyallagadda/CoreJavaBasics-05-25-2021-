package com.ojas.encapsulation;

public class Account {
	
	private double balance;
	private int accountNo;
	private float interestRate;
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	public void deposit(double amount) {
		balance = this.balance + amount;
	}

	public void withDraw(double amount) {
		balance = this.balance - amount;
	}

	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNo=" + accountNo + ", interestRate=" + interestRate + "]";
	}
	

}

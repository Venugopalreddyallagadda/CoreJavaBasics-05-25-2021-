package com.ojas.polymorphism.library;

public class TestLibrary {

	public static void main(String[] args) {
		KidUsers kidUsers = new KidUsers();
		AdultUser adultUser = new AdultUser();
            kidUsers.setAge(10);
			kidUsers.registerAccount();
			kidUsers.setAge(11);		
			kidUsers.registerAccount();
			kidUsers.setBookType("KIDS");
			kidUsers.requestbook();
			//kidUsers.setBookType("FICTION");
			kidUsers.requestbook();
			adultUser.setAge(5);
			adultUser.registerAccount();
			adultUser.setAge(23);
			adultUser.setBookType("KIDS");
			adultUser.requestbook();
			kidUsers.setBookType("FICTION");
			adultUser.requestbook();

	}

}

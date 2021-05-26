package com.ojas.polymorphism;

import com.ojas.polymorphism.Shirt.ShirtMaterial;

public class Test {

	public static void main(String[] args) {
		ShirtMaterial  std = ShirtMaterial.COTTON;
		Shirt t = new Shirt(13.0f,23,""+std);
		System.out.println(t.displayDetails());
		
	}

}

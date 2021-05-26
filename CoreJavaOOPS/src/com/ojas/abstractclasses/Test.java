package com.ojas.abstractclasses;

public class Test {

	public static void main(String[] args) {
		System.out.println("Circle");
		Shape s = new Circle(13.0f);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
		System.out.println("Rectangle");
		Shape sr = new Rectangle(15.0f,15.0f);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
		System.out.println("Square");
		Shape sq = new Square(20.f);
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
		

	}

}

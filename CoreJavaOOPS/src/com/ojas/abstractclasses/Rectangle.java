package com.ojas.abstractclasses;

public class Rectangle extends Shape{
	float length;
	float breadth;
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public float getArea() {
		
		return length*breadth;
	}

	@Override
	public float getPerimeter() {
		return 2*(length+breadth);
	}

}

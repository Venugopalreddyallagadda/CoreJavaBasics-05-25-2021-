package com.ojas.abstractclasses;

public class Square extends Shape{
	
	float side;
	
	public Square() {
		super();
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float getArea() {
		return side*side;
	}

	@Override
	public float getPerimeter() {	
		return 4*side;
	} 

}

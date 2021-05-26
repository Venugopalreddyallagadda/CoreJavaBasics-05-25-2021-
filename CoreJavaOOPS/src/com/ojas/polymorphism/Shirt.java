package com.ojas.polymorphism;

public class Shirt {
	enum ShirtMaterial {
		COTTON,
		LINEN,
		POLYESTER
	}
	
	private float collarSize;
	private float length;
	private String material;
	
	public Shirt(float collarSize, float length, String material) {
		super();
		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	}
	
	public float getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(float collarSize) {
		this.collarSize = collarSize;
	}


	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
	}

	public String displayDetails() {
		return "Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]";
	}
	
	

}

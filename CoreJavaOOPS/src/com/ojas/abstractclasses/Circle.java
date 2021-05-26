package com.ojas.abstractclasses;

class Circle extends Shape{
	
		 float radius;
		 
		public Circle() {
			super();
		}

		public Circle(float radius) {
			super();
			this.radius = radius;
		}

		public float getRadius() {
			return radius;
		}

		public void setRadius(float radius) {
			this.radius = radius;
		}

		@Override
		public float getArea() {
			return  3.14f*radius;
			
		}

		@Override
		public float getPerimeter() {
			return 2*3.14f*radius;
			
		}
		
}

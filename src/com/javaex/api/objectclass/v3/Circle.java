package com.javaex.api.objectclass.v3;

public class Circle {

	
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	
	
	}



	@Override
	public boolean equals(Object o) {
			if (o instanceof Circle) {
			Circle C = (Circle)o;
			return radius == C.radius ;
			
			
			}
		return super.equals(o);
			
	}

			
	
	
	
	
	
	
	
	
	
	
	
	
}
